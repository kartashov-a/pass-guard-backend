package com.kyd3snik.app.base.error

import org.springframework.http.HttpHeaders
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.MethodArgumentNotValidException
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.context.request.WebRequest
import org.springframework.web.server.ResponseStatusException
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler

@ControllerAdvice
class DefaultExceptionHandler : ResponseEntityExceptionHandler() {

    @ExceptionHandler(ResponseStatusException::class)
    fun handleResponseStatusException(
        ex: ResponseStatusException,
        request: WebRequest
    ): ResponseEntity<Any> {
        val headers = HttpHeaders()
        val status = ex.status
        val body = ApiError(status.value(), ex.reason.orEmpty())
        return handleExceptionInternal(ex, body, headers, ex.status, request)
    }

    override fun handleMethodArgumentNotValid(
        ex: MethodArgumentNotValidException,
        headers: HttpHeaders,
        status: HttpStatus,
        request: WebRequest
    ): ResponseEntity<Any> {
        val body = ApiError(status.value(), ex.fieldError?.defaultMessage.orEmpty())
        return handleExceptionInternal(ex, body, headers, status, request)
    }

    override fun handleExceptionInternal(ex: Exception, body: Any?, headers: HttpHeaders, status: HttpStatus, request: WebRequest): ResponseEntity<Any> {
        val errorBody = (body as? ApiError) ?: ApiError(status.value(), ex.localizedMessage)
        return super.handleExceptionInternal(ex, errorBody, headers, status, request)
    }
}