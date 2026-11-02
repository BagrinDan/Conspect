
TERM=xterm -> если не работают улититы при ssh подключении

ssh -o HostKeyAlgorithms=+ssh-rsa -o KexAlgorithms=+diffie-hellman-group1-sha1 -o PubkeyAcceptedAlgorithms=+ssh-rsa
msfadmin@192.168.1.6 -> если алгоритмы у сервера старые
