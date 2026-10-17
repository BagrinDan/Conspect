**Reconnaissance(Разведка)**: Этап где атакующий собирает информацию
==🔴**Атакующий**==: 
- Сбор email адресов и учеток;
- Сканирование
- Социальная инженирия 
- OSINT

==🔵Защитник==:
- Анализ веб-логов
- Ограничение публичной инфы
- Монниторинг
	
**Типы:**
- **==🟠Active==**: тип резведки при которой мы форсируем получение информации от жертвы 
		**Такие могут быть:**
			1. Host enumeration;
				- `nmap (-sn), 
				- `arp-scan/netdiscover, 
				- `fping`
			2. Network enumeration;
				- `nmap (--traceroute)
				- `traceroute/mtr
				- `Masscan`
			3. User enumeration;
				- `kerbrute`
				- `enum4linux/ enum4linux-ng`
				- `smtp-user-enum
			4. Group enumeration
				- `Bloodhound`
				- `Idapsearch`
				- `rpcclient`
			5. Network share enumeration
				- `NetExec/CrackMapExec`
				- `smbclient`
				- `showmount`
			6. Application enumeration
				- `ffuf / gobuster`
				- `Burp Suite / Nikto / W3AF`
				- `Wappalyzer / whatweb`
				- `Feroxbuster
			7. Service enumeration
				- `nmap (-sV -sC)`
				- `netcat`
			8. Packet crafting
				- `Scapy`
				- `hping3`
			
- **==🔵Passive==**: тип разведки при которой инструменты не взаимодействуют напрямую с целью или сетью: 
		 **Такие могут быть:**
			 1. Domain enumeration
				- `crt.sh, 
				-`SecurityTrails, 
				- `Amass, 
				- `WHOIS`
				- `dnsrecon`
			 2. Packet inspection
				- `Wireshark, 
				- `tcpdump, 
				- `NetworkMiner`
			 3. OSINT
				 - `Shodan/FOFA, 
				 - `Maltego, 
				 - `theHarvester, 
				 - `Recon-ng,
				 - `SpiderFoot, 
				 - `TruffleHog/GitGuardian, 
				 - `exiftool
			 4. Recon-ng
				- `recon/domains-hosts/brute_hosts,`
			 5. Eavesdropping
				 - `tcpdump`, 
				 - `Wireshark`,
				 - `airodump-ng`

			