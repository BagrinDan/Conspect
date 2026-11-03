
**==🟠Configure DHCPv6 Server:==**
	***# Enable ipv6 routing***
		`ipv6 unicast-routing`
	***# DHCPv6 pool name***
		`ipv6 dhcp pool IPV6-STATELESS`
	***# Configure DHCPv6 pool***
		`dns-server 2001:db8:acad:1::254
		`domain-name example.com`
		`exit`
	**# Bind the DHCPv6 pool to an interface**
		`interface GigabitEthernet0/0/1`
		`description Link to LAN`
		`ipv6 address fe80::1 link-local`
		`ipv6 address 2001:db8:acad:1::/64`
		**`ipv6 nd other-config-flag`**
		**`ipv6 dhcp server IPV6-STATELESS`**
		`no shutdown`
	***# Check this shit***
		`ipconfig`


**==🟠Configure DHCPv6 Client:==**
	***# Enable ipv6 routing*** 
		`ipv6 unicast-routing`
	***# Configure client router to create an LLA***
		`interface g0/0/1`
		`ipv6 enable`
	***# Configure client router to use SLAAC***
		`ipv6 address autoconfig`
		`end`
	***# Verify client router is assigned a GUA***
		`shop ipv6 interface brief`
	***# Verify client router receveid other DHCPv6 information***
		`show ipv6 dhcp interface g0/0/1`


***==🟠Configure Statefull DHCPv6 Server==***
	**# Enable ipv6 routing**
		`ipv6 unicast-routing `
	**# Define DHCP pool**
		`ipv6 dhcp pool IPV6-STATEFUL`
	**# Configure DHCP pool**
		`address prefix 2001::db8:acad:1::/64`
		`dns-server 2001::4860:4860::8888`
		`domain-name example.com`
	**# Bind the DHCP pool to interface** 
	**# Check this shit**
	
##### ==🟠Configure a Stateful DHCPv6 Client==
	# Enable IPv6 routing 
		ipv6 unicast-routing 
	# Configure client router to create an LLA 
		interface g0/0/1
		ipv6 enable 
	# Configure client router the use DHCPv6
		ipv6 address dhcp
		end
	# show ipv6 interface brief
	# show ipv6 interface g0/0/1

**** # To show dhcp pool****
	`show ipv6 dhcp pool`



