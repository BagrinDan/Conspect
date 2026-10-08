============
-- AZ 900 --
============

1.)
> Cloud Computing - delivery model for service like:
    - Compute power (Linux/Windows/Web) - вычислительные мощности. Сервисы на которых выполняется код и запускается приложение. 
        * Сюда входят VM, Container Instance, k8s, azure functions
    
    - Networking - инструменты для объеденения ресурсов в защищенную инфарструктуру. 
        * Сюда входят VPN, VNets, Load Balancer и шлюзы
    
    - Storage - решения для безопасного и масштабируемного размещения данных. 
        * Сюда входят диски VM Managed Disks, Blob Sotrage, Files, DataBases

2.)
> Secure: инструменты для защиты от угроз
    - Microsoft Defender for Cloud

> Govern (управление и контроль): инструмент которые позволяет компании контролировать расходы,
соблюдать внутренние регламенты и законы
    - Azure Policy: правила запрещающие сотрудникам создавать слишком дорогие серверы или ресурсы в запрещенных регинах
    - Azure Blueprints и тегирование ресурсов для учета затрат

> Administer: Способы и интерфейсы с помощью которых вы управляете ресурсами и развертываете их.
    - Azure Portal (веб-инетфрейс), Azure CLI, Azure Resource Manager (ARM, шаблоны для автоматического создания инфраструктуры) 
    и управление пользователями через Microsoft Entra ID

3) 
> Infrastructure management (Управление инфраструктурой): Понимание того, как работают серверы, сети, операционные системы и физическое или виртуальное «железо».

> Database management (Управление базами данных): Представление о том, как хранятся данные, чем реляционные БД отличаются от нереляционных и как устроены таблицы или запросы.

> Software development (Разработка программного обеспечения): Базовые знания о том, как пишутся приложения, как работают исходный код, компиляция, развертывание и жизненный цикл ПО.

































    Key Characteristics:
        - Scalabilty:
            - Vertical Scaling (Scaling up/Scaling down)
            - Horizontail Scaling (Scaling Out/ Scaling In)
        > Scalability is the ability to scale. Is ability 
        of allocating (adding) or deallocating (removing resorces)

        - Elasticity - is the ability to scale dynamiclly

        - Agility - is the ability to react quickly and allocate and deallocate resources quickly

        - Fault Tolerance - is the ability to remain up and running during component and service failures

        - Disaster - is a serious disruption of service caused by natural or human-induced causes

        - Disaster recovery - is the ability to recover from an event taht has taken down the service (disaster)

        - Availability - is a measur of system uptime for users/services

        - High availability - is the ability to keep services running for extended periods of time with very little downtime

        - Capacity - множественные ресурсы которые заменяют друг друга в случае Disaster


> Сonsumption-based model - эконоическая модель ценообразования при которой мы платим столько
сколько ресурсов мы потратили

> CapEx - финансовый термин, который подразумивает использование физических серверов

> OpEx - финансовый термин который подрозумивает использование облака

