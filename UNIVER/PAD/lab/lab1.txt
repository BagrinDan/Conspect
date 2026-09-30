
==================
    План лабы 1
==================

> Тема: Dezvoltarea unui sistem distribuit de colectare a telemetriei
și a jurnalelor, bazat pe evenimente și pe modelul Publish/Subscribe.


> Брокер — Java
    * Копит данные в случае если упадает sub

> Pub 1 (Метрики CPU/RAM) — Go

> Pub 2 (Логи) — Python

> Sub 1 & Sub 2 (Отображение метрик и алармы) — Go

>  Pub1-2 в dockercompose:
   Брокер + InfluxDB + Loki + Grafana в dockercompose
   Sub1-2 в k3s


> Storage
    *Transient (In-memory)

    *Persistent (On-Disk) - Loki (Logs)/ InfluxDB (Metrics)


> Pipeline:
    ===========================================================================
        pub1-2 -> Broker -> sub1-2 -> Storage (Loki, influxDB) -> Grafana
    ===========================================================================
