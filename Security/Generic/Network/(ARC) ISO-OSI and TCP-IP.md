

| Level | Name         | Function                                       | Tip              | Protocols                           |
| ----- | ------------ | ---------------------------------------------- | ---------------- | ----------------------------------- |
| 7     | Application  | Interfata directa cu apliicatii utilizatorului | Date             | HTTP, HTTPS,<br>FTP, SSH, DNS, SMTP |
| 6     | Presentation | Formarea, criptarea si compresia datelor       | Date             | SSL/TLS, JPEG, ASCII, MIME          |
| 5     | Session      | Administrarea si controlul conexiunelor        | Date             | NetBIOS, RPC, PPTP                  |
| 4     | Transport    | Transmisiunea end-to-end                       | Segment/Datagram | TCP, UDP                            |
| 3     | Internet     | Rutare intre retele diferite                   | Packet           | IP, ICMP, ARP                       |
| 2     | Data-Link    | Transfer de date in aceasi retea locala        | Frame            | Ethernet, WIFI, MAC                 |
| 1     | Physical     | Transmiterea bitilor prin cablu                | Bit              | Cabluri optice                      |


| Level | Name           | Describtion                          |
| ----- | -------------- | ------------------------------------ |
| 4     | Application    | Application + Presentation + Session |
| 3     | Transport      |                                      |
| 2     | Internet       |                                      |
| 1     | Network Access | DataLink + Physical                  |
