**id dhcp excluded-address** *low-addres high-addres*

**ip dhcp pool** *pool-name*

**network** *network-number* (mask | prefix length)

**default**-**router** *address* *address1... adressN*

**dns-server** *address*

**domain-name** *domain*

**lease** *{days {house { minutes }} | infinite}*

**netbios-name-server** *address* *{ address1... adressN}*


EXAMPLE:
	ip dhcp excluded-address 192.168.10.1 192.168.10.9
	ip dhcp excluded-address 192.168.10.254
	ip dhcp pool LAN-POOL-1
		network 192.168.10.0 255.255.255.0
		default-router 192.168.11.5
		dns-server 192.168.11.5
		domain-name example.com
		end

Verification:
	show running-config | section dhcp
	show ip dhcp binding
	show ip dhcp server statistics

no service dhcp
service dhcp


---------------
Configure Router as Client
int g0/0/1
ip address dhcp
no shutdown


ip helper-address 10.1.1.2