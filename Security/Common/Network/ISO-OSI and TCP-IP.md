
### **OSI/ISO**

| Level | Name         | Function                                       | Tip              | Protocols                           |
| ----- | ------------ | ---------------------------------------------- | ---------------- | ----------------------------------- |
| 7     | Application  | Interfata directa cu apliicatii utilizatorului | Date             | HTTP, HTTPS,<br>FTP, SSH, DNS, SMTP |
| 6     | Presentation | Formarea, criptarea si compresia datelor       | Date             | SSL/TLS, JPEG, ASCII, MIME          |
| 5     | Session      | Administrarea si controlul conexiunelor        | Date             | NetBIOS, RPC, PPTP                  |
| 4     | Transport    | Transmisiunea end-to-end                       | Segment/Datagram | TCP, UDP                            |
| 3     | Internet     | Rutare intre retele diferite                   | Packet           | IP, ICMP, ARP                       |
| 2     | Data-Link    | Transfer de date in aceasi retea locala        | Frame            | Ethernet, WIFI, MAC                 |
| 1     | Physical     | Transmiterea bitilor prin cablu                | Bit              | Cabluri optice                      |

--------------------

### **TCP/IP**

| Level | Name           | Describtion                          |
| ----- | -------------- | ------------------------------------ |
| 4     | Application    | Application + Presentation + Session |
| 3     | Transport      |                                      |
| 2     | Internet       |                                      |
| 1     | Network Access | DataLink + Physical                  |

---------------
### OSI Described

**OSI - 7 Layers:**
    [7] Application Layer: Точка взаимодействия пользователских приложении в сети.
        - Работает с: **сообщение, запросы/ответы**
        - Протоколы: **HTTP/HTTPS/ FTP, SMTP, DNS, DHCP, SSH**
    [6] Presentation: Преобразование данных из формата приложения в сетевой формат и обратно. Отвечает за синтаксис: кодирование (*UTF-8*), шифрование (TLS/SSL) сжатие/распакоука данных.
        - Работает с: **структуры данных, формат кодирование**
        - Протоколы: **TLS/SSL**
        - Кодировки: **UTF-8, Base64**
        - Форматы: **JPEG, PNG**
    [5] Session layer: Управляет сеансами связи: установление, поддрежание, синхронизация и завершение сеансов между приложенями.
        - Работает с: сеансы, диалоги, токены управление.
        - Протоколы: **NetBios, RPC**
    [4] Transport Layer: Обеспечение надеждной или быстрой доставки данных между приложениями на разных хостах.
        - Работает с: **TCP** *(сегметы)*, **UDP** *(датаграммы)*
        - Протоколы: **TCP, UDP**
    [3] Network Layer: Маршрутизация данных между разными сетями и определение оптимального пути доставки пакета от истичника к получателю во всем глобальном прострастве
        - Работает с: **Пакетами**
        - Оборудование: **Маршрутизаторы (роутеры), Layer 3 свичи**
        - Протоколы: **IP, ICMP, IPsec, протоколы маршрутизации (OSPF, BGP)**
    [2] Data Link Layer: Обеспечивает надежную передачу данных между узлами, находящимися в одной физической сети, а так же обнаружением и исправлением ошибок возникших на физ канале.
        - Работает с: **Кадрами (фреймы), MAC адресс**
        - Оборудование: **Свичи, мосты**
        - Поддуровни: **LLC** - управляет связью с сетевым уровнем и протоколами
                      **MAC** - управляет доступом к физической среде передачи
        - Протоколы: **Ethernet, WIFI, PPP**
     [1] Physical Layer: Передача сырого потока бита через физическую среду (кабель)
        - Работает с: **битами**
        - Оборудование: **кабель, хабы, сетевые адаптеры, беспроводные каналы**
