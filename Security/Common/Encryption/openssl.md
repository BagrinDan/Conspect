### **Симметричные алгоримы:**

`openssl enc -aes-256-ctr -pbkdf2 -e -a -in plain.txt -out encrypted.txt`
	- `openssl enc` - запуск утилиты
	- `-aes-256-ctr` - алгоритм шифрования 
	- `-pbkdf2` - алгоритм создания ключа
	- `-e` - *(encrypt)* режим шифрования
	- `-a` - кодируем текст после шифрования

`openssl enc -aes-256-ctr -pbkdf2 -d -a -in encrypted.txt -out decrypted.txt`
	- `openssl enc` - запуск утилиты
	- `-aes-256-ctr` - алгоритм шифрования 
	- `-pbkdf2` - алгоритм создания ключа
	- `-d -` *(decrypt)* режим расшифровки
	- `-a` - раскодирует текст *(Base64)* после шифрования

---------------------------

#### Асимметричные алгоритмы 
`openssl genrsa -out pub_priv_pair.key 1024`
	- `openssl genrsa` - генерируем асимметричный ключ с длинной 1024 бит

openssl rsa -text -in pub_priv_pair.key
openssl rsa -in pub_priv_pair.key -pubout -out public_key.key
openssl pkeyutl -encrypt -pubin -inkey public_key.key -in plain.txt -out cipher.bin -pkeyopt rsa_padding_mode:oaep

openssl base64 -in cipher.bin -out cipher64.txt
openssl base64 -d -in cipher64.txt -out cipher64.bin

openssl pkeyutl -decrypt -inkey pub_priv_pair.key -in cipher64.bin -out plainD.txt -pkeyopt rsa_padding_mode:oaep