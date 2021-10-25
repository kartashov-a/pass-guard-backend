INSERT INTO PASSWORD_ITEM(NAME, LOGIN, PASSWORD, URL)
VALUES ('VK', 'test_user', 'test_passoword', 'https://vk.com'),
       ('Facebook', 'test_user_facebook', 'test_facebook_passoword', null),
       ('Google', 'test_gmail_user', 'password', null);

INSERT INTO CARD_ITEM(NAME, NUMBER, HOLDER_NAME, EXPIRATION_DATE, CVC)
VALUES ('Sber', '0000 0000 0000 0001', 'Ivan', CURRENT_DATE(), '888'),
       ('Alpha', '0000 0000 0000 0002', 'Andrey', CURRENT_DATE(), '345'),
       ('Tinkoff', '0000 0000 0000 0003', 'Alex', CURRENT_DATE(), '123');

INSERT INTO NOTE_ITEM(NAME, TEXT)
VALUES ('Secret note', 'Note #1'),
       ('Draft', 'Note #2'),
       ('Doesn''t matter', 'Note #3');

