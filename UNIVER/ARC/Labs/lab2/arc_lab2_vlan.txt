
    > Normal range: 1 - 1005 (1002, так как последние 3 для легаси систем)

    > Extended range: 1006 - 4096

    #################
    # Создания vlan #`
    #################
        !!! Создания VLAN ..
            conf t 
                vlan [vlan id] ### vlan id -> 10, 20, 108 и так далее
                name [name vlan] 
            end

            show vlan brief ### СПИСОК ВСЕХ VLAN 

            conf t
                no vlan [vlan id] ### УДАЛЕНИЕ VLAN 
            end 
        

        *** Пример создания VLAN 
            conf t
                vlan 20
                name student
            end 

        *** Пример подключения VLAN к интерфейсу 
            conf t 
                interface [interface id] 
                    switchport mode access 
                    switchport access vlan [vlan id]
            end 
        

        !!! Пример подключения VLAN с телефоном
            conf t
                interface fa0/6
                    switchport mode access 
                    switchport access vlan 20
                    mls qos trust cos
                    swithcport voice vlan 150
            end 

        ##############
        # VLAN TRUNK #
        ##############
        !!! Пример 
            conf t
                interface [g_interface id]
                    switchport mode trunk
                    switchport trunk native vlan [vlan_id] # Куда пойдут НЕ ТЕГИРОВАНЫЕ пакет 
                    switchport trunk allowed vlan [vlan_list] # Куда пойдут тегированые пакет
            end 

        !!! Проверить 
            show interface fa0/1 switchport 
                ...
                Switchport: Enabled
                Administrative Mode: trunk
                Operational Mode: trunk
                Administrative Trunking Encapsulation: dot1q
                Operational Trunking Encapsulation: dot1q
                ...
                Trunking VLANs Enabled: 10,20,30,99
                ...

        !!! Убрать trunk
            int fa0/1
                no switchport trunk allowed vlan 
                no switchport trunk native vlan
            end 

        #######
        # DTP #
        #######
            switchport mode trunk -> Нужно перейти в trunk чтобы включить DTP

            !!!! ОТКЛЮЧАЕТ DTP 
            switchport nonegotiate 
            !!!! ВКЛЮЧАЕТ DTP 
            switchport mode dynamic auto
            

            swtichport mode access -> жестко работает не в trunk 
            switchport mode dynamic auto -> Пассивно ждет сигнала для перехода в trunk
            switchport mode dynamic desirable -> Порт сам активно предлогает соседу стать trunk 
            switchport mode trunk -> жестко работает в trunk

            show interfaces trunk -> чтобы понять настройку trunk
            show vlan brief -> чтобы понять настройку vlan '


            default interface f0/13