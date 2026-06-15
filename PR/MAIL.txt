
    > SMTP - протокол отправки писем
        > Port: 25, 
                587 (SMTP + STARTTLS), 
                465 (SMTPS) 

    > POP3 - протокол получения писем (скачать и забрать)
        > Port: 110, 
                995 (POP3S)

    > IMAP - получение писем с синхронизацией
        > Port: 143, 
                993 (IMAPS)

    > Структура писем:
        [Envelope]
            > MAIL FROM - отправитель
            > RCPT TO - получатель

        [Header]
            > From: кто отправил 
            > To: кому отправленно
            > Date: дата и время отправки 

        [Body]
            > Текст,
            > Вложения 

    > Доп. параметры:
        CC (Carbon Copy) - копия письма видна всем, попадает в Header

            To: boss@company.com
            CC: dev1@company.com, dev2@company.com
            - Все знают, кто ещё в курсе ситуации

        BCC (Blind Carbon Copy) - скрытая копия. НЕ попадает в Header вообще но добавляется в SMTP Envelope как отдельный RCPT TO
            To: boss@company.com
            BCC: ceo@company.com
            - Босс не знает, что CEO тоже получил письмо

        SPF (Sender Policy Framework) - имеет ли этот сервер право отправлять почту от имени домена
            > Пример: только gmail.com серверы могут отправлять письма от gmail.com

        DKIM (DomainKeys Identified Mail) - Добавляет цифровую подпись в письмо и проверяет если письмо НЕ изменяли по дороге

        DMARC - Это “менеджер политики”. Решает если письмо не прошло SPF или DKIM: принять, отклонить, в спам

        MIME (Multipurpose Internet Mail Extensions) - превращает вложения в текст и упоковывает 
