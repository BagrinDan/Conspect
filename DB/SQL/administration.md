===============================
-- Создать пользователя в бд --
===============================
    Maria/Mysql
        CREATE USER 'app_user'@'localhost' IDENTIFIED BY 'StrongPassword123@';
        GRANT ALL PRIVILEGES ON student_db.* TO 'app_user'@'localhost';
        
        [or]

        GRANT SELECT, INSERT, UPDATE, DELETE ON student_db.* TO 'app_user'@'localhost';
        FLUSH PRIVILEGES;

    MSSQL
        Master: CREATE LOGIN amadeus_application WITH PASSWORD = 'StrongPassword123@';

        DB: CREATE USER amadeus_application FOR LOGIN amadeus_application;
            ALTER ROLE db_datareader ADD MEMBER amadeus_application;
            ALTER ROLE db_datawriter ADD MEMBER amadeus_application;

=========================
-- Проверить и удалить --
=========================

DROP USER 'user1'@'localhost'

SELECT User, Host FROM mysql.user;


=====================
-- Создать таблицу --
=====================

    MySQL/ MariaDB:
        CREATE TABLE users (
            id INT AUTO_INCREMENT PRIMARY KEY,
            uuid VARCHAR(36) NOT NULL,            
            username VARCHAR(50) NOT NULL UNIQUE,
            password VARCHAR(255) NOT NULL,            
            created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
        );
    

    MSSQL:
        CREATE TABLE users (
            id INT IDENTITY(1,1) PRIMARY KEY,
            uuid UNIQUEIDENTIFIER NOT NULL DEFAULT NEWID(),
            username NVARCHAR(50) NOT NULL UNIQUE,
            password NVARCHAR(255) NOT NULL,            
            created_at DATETIME2 NOT NULL DEFAULT GETDATE()
        );

        
