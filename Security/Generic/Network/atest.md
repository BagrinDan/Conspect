---
tags:
  - retele
  - evaluare1
  - administrare
  - qos
  - mpls
date: 2026-10-14
---

# Subiecte pentru Evaluarea 1: Administrarea Rețelelor de Calculatoare

---

### 1. Modelul de referință OSI ISO
> [!question] Care este structura și rolul fiecărui nivel în modelul OSI?
- **Definiție:** Modelul conceptual de referință Open Systems Interconnection, creat de ISO, împărțit în **7 niveluri**:
  1. **Fizic (Physical):** Transmiterea biților nestructurați pe mediul fizic (cabluri, semnale electrice/optice).
  2. **Legătură de date (Data Link):** Adresare fizică (MAC), încadrare în cadre (frames) și detectarea erorilor pe un singur segment.
  3. **Rețea (Network):** Adresare logică (IP) și dirijare/rutare (routing) între rețele diferite.
  4. **Transport (Transport):** Comunicare end-to-end, controlul fluxului, segmentare și reasamblare (TCP/UDP).
  5. **Sesiune (Session):** Gestionarea, stabilirea și închiderea sesiunilor de comunicare între aplicații.
  6. **Prezentare (Presentation):** Criptare, compresie, formatarea datelor (format translație: JSON, ASCII).
  7. **Aplicație (Application):** Interfața directă cu aplicațiile utilizator (HTTP, FTP, SMTP, DNS).

---

### 2. Modelul arhitectural și protocoale TCP/IP: descriere generală
> [!question] Cum este structurată stiva TCP/IP și cum se compară cu OSI?
- **Stiva TCP/IP (4-5 niveluri):**
  1. **Nivelul Acces Rețea (Network Access / Link):** Corespunde nivelurilor 1 și 2 OSI (Ethernet, Wi-Fi).
  2. **Nivelul Internet:** Corespunde nivelului 3 OSI. Protocol de bază: **IP** (IPv4, IPv6), alături de ICMP, ARP.
  3. **Nivelul Transport:** Corespunde nivelului 4 OSI. Protocoale principale: **TCP** (orientat pe conexiune, de încredere) și **UDP** (fără conexiune, rapid).
  4. **Nivelul Aplicație:** Reunește nivelurile 5, 6 și 7 OSI (HTTP, SSH, DNS, DHCP).

---

### 3. Adrese MAC-48, EUI-48 și EUI-64
> [!question] Ce reprezintă adresele MAC/EUI și care este structura lor?
- **MAC-48 / EUI-48:** Adresă fizică de 48 biți (6 octeți) unică la nivel mondial, arsă în placa de rețea (NIC).
  - Format: `XX:XX:XX:YY:YY:YY`
  - **OUI (Organizationally Unique Identifier):** Primii 24 biți (identifică producătorul).
  - **NIC Extension:** Ultimii 24 biți (număr de serie atribuit de producător).
- **EUI-64:** Extindere la 64 biți pentru rețele moderne (inclusiv IPv6 SLAAC).
  - **Conversie din EUI-48 în EUI-64:** Se inserează `FF:FE` în mijlocul adresei MAC de 48 biți și se inversează bitul U/L (Universal/Local - bitul 7 din primul octet).

---

### 4. Adresarea IPv4: schema CIDR și adrese private
> [!question] Cum funcționează CIDR și care sunt domeniile de adrese IPv4 private?
- **Classless Inter-Domain Routing (CIDR):** Înlocuiește clasele fixe (A, B, C) cu o mască flexibilă exprimată prin notarea cu slash (ex: `/24` = 255.255.255.0). Permite alocarea eficientă și agregarea rutelor.
- **Adrese IPv4 Private (RFC 1918):** Nu sunt rutabile pe Internet public.
  - **Clasa A:** `10.0.0.0/8` (`10.0.0.0` – `10.255.255.255`)
  - **Clasa B:** `172.16.0.0/12` (`172.16.0.0` – `172.31.255.255`)
  - **Clasa C:** `192.168.0.0/16` (`192.168.0.0` – `192.168.255.255`)

---

### 5. Adresarea IPv6: reprezentare și particularități față de IPv4
> [!question] Care sunt avantajele IPv6 și cum se reprezintă adresele?
- **Lungime:** 128 biți (față de 32 biți IPv4).
- **Reprezentare:** 8 grupuri de câte 4 cifre hexazecimale separate prin două puncte (`:`).
  - *Reguli de simplificare:* Eliminarea zerourilor din față; înlocuirea o singură dată a secvențelor de grupuri consecutive de zero cu `::`.
- **Particularități față de IPv4:**
  - Spațiu enorm de adresare ($2^{128}$).
  - Fără necesitate de NAT (Network Address Translation).
  - Autoconfigurare fără stare (SLAAC) integrată.
  - Securitate nativă (IPsec obligatoriu în specificația originală).
  - Fără mesaje Broadcast (se folosește Multicast).

---

### 6. Activități cu crearea și dezvoltarea rețelelor de calculatoare
> [!question] Ce etape implică proiectarea și extinderea unei rețele?
- **Etape cheie:**
  1. **Analiă de cerințe:** Identificarea traficului, utilizatorilor, aplicațiilor și cerințelor de securitate.
  2. **Proiectare logică:** Arhitectura IP, VLAN-uri, protocoale de rutare, politici QoS și securitate.
  3. **Proiectare fizică:** Alegerea mediului de transmisie (fibră, cupru), echipamentelor (switch-uri, routere) și topologiei.
  4. **Implementare și Testare:** Cablare, configurare echipamente, verificare latență și throughput.
  5. **Scalabilitate:** Crearea unei rețele modulare ce permite extinderea fără rediz hiscriptare majoră (arhitectură pe 3 niveluri: Core, Distribution, Access).

---

### 7. Activități cu asigurarea funcționării rețelelor de calculatoare
> [!question] Ce acțiuni garantează operarea continuă a rețelei?
- **Operare și Mentenanță (O&M):**
  - **Monitorizare continuă:** Trafic, încărcare CPU/RAM pe echipamente (SNMP, Syslog, NetFlow).
  - **Backup & Recovery:** Salvarea periodică a configurațiilor echipamentelor de rețea.
  - **Actualizări (Patching):** Update de firmware/IOS pentru rezolvarea vulnerabilităților.
  - **Gestiunea incidentelor:** Identificarea rapidă a defecțiunilor fizice sau de software.

---

### 8. Esența, funcțiile și rolul administrării rețelelor. Administratorii de rețea
> [!question] Care sunt domeniile principale de administrare (modelul FCAPS)?
- **Definiție:** Ansamblul de mijloace umane, hardware și software folosite pentru planificarea, organizarea, monitorizarea și controlul resurselor din rețea.
- **Modelul FCAPS (ISO):**
  1. **Fault Management:** Detectarea și izolarea erorilor.
  2. **Configuration Management:** Gestionarea configurațiilor și modificărilor.
  3. **Accounting Management:** Măsurarea utilizării resurselor per utilizator/grup.
  4. **Performance Management:** Asigurarea parametrilor optimi de funcționare.
  5. **Security Management:** Controlul accesului și protecția datelor.

---

### 9. Caracteristici ale rețelelor de calculatoare
> [!question] Care sunt metricile de bază ale unei rețele?
- **Lățime de bandă (Bandwidth):** Capacitatea maximă teoretică de transmisie ($bit/s$).
- **Debit util (Throughput):** Cantitatea reală de date transferată cu succes într-o unitate de timp.
- **Latență (Delay/Latency):** Timpul necesar pentru ca un pachet să ajungă de la sursă la destinație.
- **Jitter:** Variația în timp a latenței (critic pentru voce/video).
- **Rata de pierdere a pachetelor (Packet Loss):** Procentul de pachete pierdute din cauza aglomerării sau erorilor.
- **Fiabilitate și Disponibilitate (Uptime):** Procentul de timp în care rețeaua este funcțională (ex: $99.999\%$).

---

### 10. Servicii de rețea: caracterizare generală
> [!question] Ce sunt serviciile de rețea și cum se clasifică?
- **Definiție:** Aplicații sau capacități furnizate peste infrastructura de rețea pentru utilizatorii finali sau pentru operarea sistemelor.
- **Tipuri de servicii:**
  - **Servicii de infrastructură:** DNS (rezolvare nume), DHCP (alocare IP), NTP (sincronizare timp).
  - **Servicii utilizator:** Web (HTTP/HTTPS), E-mail (SMTP/IMAP), File Transfer (FTP/SMB), Comunicare în timp real (VoIP, Videoconferințe).

---

### 11. Calitatea serviciilor (QoS): esență, definiție, perspectiva utilizatorului
> [!question] Ce este QoS și cum este percepută de utilizator?
- **Definiție:** Capacitatea rețelei de a oferi un tratament diferențiat traficului de rețea, garantând sau prioritizând anumite resurse (bandă, latență, jitter).
- **QoS vs. QoE (Quality of Experience):**
  - **QoS:** Parametri tehnici măsurați obiectiv în rețea (latență, pierderi, jitter).
  - **QoE:** Percepția subiectivă a utilizatorului final privind performanța aplicației (ex: apel audio clar, fără întreruperi).

---

### 12. Performanța rețelelor de calculatoare
> [!question] Cum se evaluează performanța globală a rețelei?
- Performanța este evaluată prin analiza comportamentului rețelei sub sarcini normale și de vârf.
- **Factori de degradare:**
  - Congestia nodurilor (cozi pline pe routere).
  - Coliziuni și erori la nivelul fizic.
  - Rutare suboptimă sau bucle de rutare.

---

### 13. Criterii de apreciere a calității serviciilor de rețea (Criterii QoS)
> [!question] Care sunt cei 4 piloni de măsurare QoS?
1. **Lățimea de bandă (Bandwidth / Throughput):** Garantarea unei viteze minime de transfer.
2. **Întârzierea (Latența / Delay):** Timpul total de tranzit (Processing + Queuing + Transmission + Propagation).
3. **Jitter-ul:** Variația întârzierii de livrare a pachetelor successive.
4. **Pierderea de pachete (Packet Loss):** Procentajul de pachete aruncate din cauza aglomerării.

---

### 14. Cerințe QoS pentru VoIP și Video
> [!question] Care sunt pragurile critice pentru traficul de Voce și Video?
- **VoIP (Voce peste IP):** Trafic extrem de sensibil la latență și jitter.
  - Latență $\le 150 \text{ ms}$ (One-way).
  - Jitter $\le 30 \text{ ms}$.
  - Pierdere pachete $\le 1\%$.
  - Bandă redusă (aprox. 64–128 kbps per apel), dar constantă.
- **Video în timp real (Videoconferințe):**
  - Latență $\le 200–400 \text{ ms}$.
  - Jitter $\le 30–50 \text{ ms}$.
  - Pierdere pachete $\le 0.5\% – 1\%$.
  - Bandă mare (de la câțiva Mbps până la zeci de Mbps).

---

### 15. Cerințe QoS pentru traficul de date
> [!question] Cum diferă cerințele traficului de date de cele de timp real?
- **Trafic de date critic (ex: tranzacții bancare, baze de date, SSH):** Sensibil la **pierderi de pachete** ($0\%$), mai puțin sensibil la latență.
- **Trafic Best-Effort (ex: Web browsing, e-mail, download):** Tolerant la latență, jitter și pierderi temporare (TCP retransmite datele). Nu necesită garanții speciale de QoS.

---

### 16. Lista tehnicilor/metodelor/algoritmilor de îmbunătățire a calității serviciilor
> [!question] Ce instrumente sunt folosite pentru a arhitecturaliza QoS?
1. **Over-provisioning (Supra-aprovizionarea).**
2. **Buffering (Memorarea temporară).**
3. **Rezervarea resurselor (Intserv / RSVP).**
4. **Clasificarea și Marcarea pachetelor (Difserv - DSCP, CoS).**
5. **Shaping și Policing (Profilarea și Controlul accesului).**
6. **Algoritmi de planificare a cozilor (Queuing: FIFO, PQ, WFQ, CBWFQ).**
7. **Prevenirea congestiei (WTD, RED, WRED).**

---

### 17. Tehnici de îmbunătățire a calității serviciilor: supra aprovizionarea și memorarea temporară
> [!question] Cum funcționează Over-provisioning și Buffering?
- **Supra-aprovizionarea (Over-provisioning):** Mărirea capacității legăturilor de date într-atât încât congestia să nu apară niciodată. *Avantaj:* Simplu. *Dezavantaj:* Foarte scump, ineficient economic.
- **Memorarea temporară (Buffering):** Stocarea pachetelor în memorie RAM (cozi) în timpul momentelor de vârf de trafic, pentru a preveni aruncarea lor imediată. *Dezavantaj:* Crește latența și jitterul.

---

### 18. Tehnici de îmbunătățire a calității serviciilor: rezervarea de resurse și dirijarea proporțională
> [!question] Ce presupune rezervarea explicită de resurse?
- **Rezervarea de resurse:** Echipamentele din rețea alocă o bandă fixă și procesare dedicată unui flux de date înainte ca acesta să fie transmis (ex: protocolul RSVP în modelul Intserv).
- **Dirijarea proporțională (Proportional Routing / Load Balancing):** Partajarea traficului pe mai multe căi alternative în funcție de capacitatea și încărcarea fiecăreia.

---

### 19. Tehnici de îmbunătățire a calității serviciilor: profilarea și monitorizarea traficului
> [!question] Ce este Traffic Shaping și cu ce diferă de Traffic Policing?
- **Profilarea traficului (Traffic Shaping):** Întârzie pachetele care depășesc o rată definită, stocându-le în coadă pentru a netezi fluxul de date (smooth output).
- **Controlul/Policingul (Traffic Policing):** Aruncă (drop) sau re-marchează imediat pachetele care depășesc limita stabilită.
- **Monitorizarea:** Colectarea de statistici despre consumul de bandă pentru ajustarea dinamica a politicilor.

---

### 20. Tehnici de îmbunătățire a calității serviciilor: controlul accesului
> [!question] Ce rol are Admission Control?
- **Admission Control (Controlul admiterii):** Verifică dacă rețeaua are suficiente resurse disponibile *înainte* de a accepta o nouă conexiune/flux (ex: un nou apel VoIP). Dacă resursele sunt insuficiente, conexiunea este respinsă pentru a nu degrada calitatea fluxurilor deja existente.

---

### 21. Algoritmul găleții găurite și algoritmul găleții cu jetoane
> [!question] Cum funcționează Leaky Bucket și Token Bucket?
- **Leaky Bucket (Găleata găurită):**
  - Convertește un trafic cu rafale (bursty) într-un trafic cu rată fixă, constantă la ieșire.
  - Pachetele care depășesc capacitatea găleții sunt aruncate.
  - *Utilizare:* Traffic Shaping.
- **Token Bucket (Găleata cu jetoane):**
  - Jetoanele sunt adăugate în găleată cu o rată constantă $r$. Găleata are o capacitate maximă $b$.
  - Pentru a transmite un pachet, trebuie consumat un jeton.
  - Permite **rafale de trafic** (bursts) dacă există suficiente jetoane acumulate.
  - *Utilizare:* Traffic Policing și Shaping modern.

---

### 22. Clasificarea și planificarea pachetelor: aspecte generale
> [!question] Care sunt pașii procesării pachetelor într-un router cu QoS?
1. **Clasificare:** Identificarea tipului de trafic pe baza câmpurilor din antet (IP sursă/destinație, porturi, CoS, DSCP).
2. **Marcare:** Salvarea clasei identificate direct în antetul pachetului (ex: setarea biților DSCP).
3. **Planificare (Scheduling):** Plasarea pachetelor în cozi separate și extragerea lor conform unui algoritm specific.

---

### 23. Disciplinele de planificare FIFO și PQ
> [!question] Prin ce difera FIFO de Priority Queuing (PQ)?
- **FIFO (First-In, First-Out):**
  - O singură coadă. Pachetele sunt procesate în ordinea sosirii.
  - Fără prioritizare. Traficul critic poate suferi întârzieri mari dacă există congestie.
- **PQ (Priority Queuing):**
  - Cozi multiple cu niveluri de prioritate stricte (ex: High, Medium, Low).
  - Coada cu prioritate mică este procesată **doar dacă** cozile cu prioritate superioară sunt complet goale.
  - *Problemă:* Risc de înfometare (**starvation**) pentru traficul cu prioritate redusă.

---

### 24. Disciplinele de planificare RR, Byte RR și WRR
> [!question] Cum rezolvă WRR problema prioritizării echitabile?
- **Round Robin (RR):** Ciclează prin toate cozile, servind câte un pachet din fiecare coadă.
  - *Problemă:* Inechitabil dacă pachetele au dimensiuni diferite.
- **Byte Round Robin:** Alocă servirea pe baza numărului de octeți, nu de pachete.
- **Weighted Round Robin (WRR):** Fiecărei cozi i se atribuie o pondere (greutate $W_i$). Cozile cu pondere mai mare transmit mai mulți octeți/pachete la fiecare ciclu. Previne înfometarea.

---

### 25. Disciplinele de planificare FQ și WFQ
> [!question] Cum asigură WFQ partajarea echitabilă a benzii?
- **Fair Queuing (FQ):** Creează virtual cozi separate pentru fiecare flux de date (flow) și le servește în mod egal.
- **Weighted Fair Queuing (WFQ):**
  - Clasifică traficul în fluxuri bazate pe 5-tuple (IP sursă/destinație, Port sursă/destinație, Protocol).
  - Alocă o pondere fiecărui flux (de obicei bazată pe valoarea IP Precedence/DSCP).
  - Fluxurile cu prioritate mai mare primesc mai multă bandă, dar fluxurile mici nu suferă de înfometare.

---

### 26. Disciplina de planificare CBWFQ
> [!question] Ce este Class-Based Weighted Fair Queuing (CBWFQ)?
- **CBWFQ:** Extinde WFQ permițând administratorului să creeze **clase de trafic definite de utilizator** (ex: clase pentru SQL, Web, Voice).
- Fiecărei clase i se garantează o cantitate minimă de bandă de frecvență (procentual sau kbps) în caz de congestie.
- În cadrul fiecărei clase se poate aplica planificarea WFQ.

---

### 27. Gestionarea firașelor (cozilor): metodele TD, WTD și RED
> [!question] Cum previn metodele de gestionare a cozilor congestia?
- **Tail Drop (TD):** Când coada este complet plină, toate pachetele noi sosite sunt aruncate.
  - *Problemă:* Cauzează **Global TCP Synchronization** (toate sesiunile TCP își reduc fereastra de transmisie simultan, scăzând drastic utilizarea legăturii).
- **Weighted Tail Drop (WTD):** Aruncă pachetele în funcție de prioritate când coada atinge anumite praguri de umplere diferențiate.
- **Random Early Detection (RED):** Aruncă pachete *aleatoriu* înainte ca coada să se umple complet, semnalând surselor TCP să reducă viteza treptat și evitând sincronizarea globală.

---

### 28. Gestionarea firașelor: metodele WRED și ARED
> [!question] Cum îmbunătățesc WRED și ARED algoritmul RED?
- **WRED (Weighted RED):** Combină RED cu prioritățile de trafic (IP Precedence / DSCP). Pachetele cu prioritate mai mică au o probabilitate mai mare de a fi aruncate devreme atunci când coada începe să se umple.
- **ARED (Adaptive RED):** Ajustează dinamic parametrii RED în funcție de comportamentul traficului din rețea pentru a menține probabilitatea optimă de aruncare.

---

### 29. Determinarea caracteristicilor unor componente RC reprezentate prin sisteme de așteptare
> [!question] Cum se aplică Teoria Firelor de Așteptare (Queuing Theory) în rețele?
- Routerele și switch-urile sunt modelate ca sisteme de așteptare (ex: M/M/1, M/M/c în notația Kendall).
- **Parametri calculați:**
  - $\lambda$ (Rata de sosire a pachetelor).
  - $\mu$ (Rata de servire/transmisie).
  - Factorul de utilizare $\rho = \frac{\lambda}{\mu}$.
  - Timpul mediu petrecut în coadă și numărul mediu de pachete din memorie. Permite optimizarea dimensiunii bufferelor.

---

### 30. Efectul concentrării resurselor în rețele
> [!question] Ce este efectul de concentrare (Statistical Multiplexing)?
- **Principiu:** Unificarea resurselor de rețea (bandă, procesare) într-o singură legătură de mare capacitate este mult mai eficientă decât împărțirea acesteia în canale dedicate mici.
- **Beneficiu:** Permite **multiplexarea statistică** — deoarece nu toți utilizatorii transmit simultan rafale maxime, banda neutilizată de un flux poate fi consumată instant de altul.

---

### 31. Lista celor 12 clase de aplicații ce pot necesita clase dedicate conform RFC 4594
> [!question] Care sunt principalele clase de servicii recomandate în RFC 4594?
RFC 4594 definește structura claselor de servicii pentru rețele IP:
1. **Telephony** (EF - Expedited Forwarding)
2. **Signaling** (CS5)
3. **Multimedia Conferencing** (AF41-AF43)
4. **Real-time Interactive** (CS4)
5. **Multimedia Streaming** (AF31-AF33)
6. **Broadcast Video** (CS3)
7. **Low-Latency Data** (AF21-AF23)
8. **OAM (Operations, Administration, Maintenance)** (CS2)
9. **High-Priority Data** (AF11-AF13)
10. **Standard / Best Effort** (DF / CS0)
11. **Low-Priority Data** (CS1 / Scavenger)
12. **Network Control** (CS6 / CS7)

---

### 32. Scenariile de supraîncărcare a resurselor și oportunitatea folosirii QoS în rețele
> [!question] Când este indispensabilă aplicarea QoS?
- **Scenarii de supraîncărcare:**
  - Legături WAN/Internet cu lățime de bandă mică (Bottlenecks).
  - Agregarea traficului din rețele LAN mari către un singur router de ieșire.
  - Vârfuri neprevăzute de trafic (bursts).
- **Oportunitatea QoS:** QoS **nu crește lățimea de bandă fizică**, dar este esențial atunci când resursele sunt insuficiente pentru a garanta că aplicațiile critice de afaceri și Vocea nu sunt afectate de traficul secundar.

---

### 33. Funcțiile instrumentelor/mecanismelor QoS în rețele
> [!question] Care este clasificarea funcțională a instrumentelor QoS?
1. **Clasificare și Marcare:** Identificarea și etichetarea pachetelor la intrare (CoS, DSCP).
2. **Gestionarea Congestiei (Queuing):** Structurarea și servirea cozilor (PQ, CBWFQ, LLQ).
3. **Evitarea Congestiei:** Aruncarea preventivă a pachetelor (WRED).
4. **Policing și Shaping:** Limitarea ratei de trafic (Leaky/Token Bucket).
5. **Eficiența Legăturii (Link Efficiency):** Compresia antetelor și fragmentarea pachetelor mari pe legături slow (LFI).

---

### 34. Esența mecanismului Intserv (Integrated Services)
> [!question] Cum funcționează Intserv și ce arhitectură utilizează?
- **Modelul Intserv:** Oferă o garanție **dură** de calitate (Hard QoS) la nivel de **flux individual**.
- Utilizează protocolul **RSVP (Resource Reservation Protocol)** pentru a rezerva resurse de bandă și memorie pe **fiecare router** de-a lungul căii de la sursă la destinație.
- *Dezavantaj major:* **Problema de scalabilitate.** Routerele din nucleul rețelei trebuie să mențină starea fiecărui flux (stateful), ceea ce este imposibil în rețele mari sau pe Internet.

---

### 35. Esența mecanismului Difserv (Differentiated Services)
> [!question] Cum funcționează Difserv și ce avantaje are față de Intserv?
- **Modelul Difserv:** O abordare de tip **Soft QoS**, bazată pe clase de trafic (Class-Based), mult mai scalabilă (stateless în core).
- Pachetele sunt clasificate și marcate la marginea rețelei (Edge) folosind câmpul **DS (Differentiated Services)** din antetul IP (6 biți = **DSCP - Differentiated Services Code Point**).
- Routerele din interiorul rețelei procesează pachetele pe baza valorii DSCP aplicând un anumit comportament numit **PHB (Per-Hop Behavior)**:
  - **EF (Expedited Forwarding):** Pentru trafic cu latență minimă (ex: Voce).
  - **AF (Assured Forwarding):** Oferă garanții de bandă și niveluri de drop.
  - **BE (Best Effort):** Trafic obișnuit.

---

### 36. Compararea mecanismelor Intserv și Difserv
> [!question] Care sunt diferențele cheie între Intserv și Difserv?

| Criteriu | Intserv | Difserv |
| :--- | :--- | :--- |
| **Garantare** | Strictă (Per-flow) | Relativă (Per-class) |
| **Scalabilitate** | Scăzută (limitată la LAN/WAN mici) | Ridicată (utilizată în rețele mari/ISP) |
| **Protocol semnalizare**| RSVP (obligatoriu) | Nu necesită semnalizare |
| **Stare în routere** | Stateful (pstrează starea fiecărui flux) | Stateless (procesează doar marcajul DSCP) |
| **Mecanism** | Rezervare prealabilă de resurse | Clasificare, Marcare și PHB |

---

### 37. Conceptul integrării Intserv și Difserv
> [!question] Cum se pot combina modelele Intserv și Difserv?
- **Model Hibrid:**
  - **La marginea rețelei (Access Network):** Se folosește **Intserv/RSVP** pentru conexiunile individuale ale utilizatorilor (garanții per flux).
  - **În nucleul rețelei (Core Network):** Cererile RSVP sunt **agregate** și mapate într-o clasa corespunzătoare **Difserv (DSCP)**.
- *Rezultat:* Se obțin garanții precise pentru aplicații la margine, păstrând în același timp scalabilitatea ridicată în nucleul rețelei.

---

### 38. Tehnologia MPLS – descriere generală
> [!question] Ce este MPLS și cum funcționează comutarea pe bază de etichete?
- **MPLS (Multiprotocol Label Switching):** Tehnologie de înaltă performanță ce redirecționează datele pe baza unor **etichete scurte (labels)** de nivel 2.5, în loc să inspecteze antetul IP complet (nivel 3) la fiecare pas.
- **Echipamente principale:**
  - **LER (Label Edge Router):** Router de margine care adaugă (Push) sau scoate (Pop) etichetele din pachete.
  - **LSR (Label Switching Router):** Router din nucleu care comută pachetele rapid (Swap) doar analizând eticheta.
- **Structura etichetei (32 biți):**
  - **Label Value:** 20 biți.
  - **EXP / Traffic Class (TC):** 3 biți (folosiți pentru QoS!).
  - **S (Bottom of Stack):** 1 bit.
  - **TTL:** 8 biți.
- **Avantaje:** Permite crearea de VPN-uri de nivel 2/3 (MPLS VPN) și **Traffic Engineering (MPLS-TE)** pentru optimizarea căilor în rețea.