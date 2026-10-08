


    ###############
    # Diagnostics #
    ###############
        Отсутсвует vlan?
            show vlan brief - краткий список VLAN 
            show interfaces switchport - позволяет понять режим интефрейса 
            ping 

        Проблемы с транком свич порта:
            show interface trunk - список всех транк портов 
            show running-config - вся кофигурация 

        Проблемы с свич acces порта:
            show interfaces switchport - позволяет понять режим интефрейса
            show running-config interface - только порты 
            ipconfig

        Проблемы с конфигурацией роутера:
            show ip interface brief 
            show interface


    ####################
    # Virual interface #
    ####################

        int g0/0.10
            encapsulation dot1Q 10 # Для vlan 10 
            ip address 172.17.10.1 255.255.255.0

        # Нативный VLAN 
        int g0/0.10
            encapsulation dot1Q 10 native 


        