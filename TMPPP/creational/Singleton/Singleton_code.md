
======================
-- 1.EagerSingleton --
======================
    public class EagerSingleton {
        // Объект создается сразу при инициализации класса в памяти
        static final EagerSingleton INSTANCE = new EagerSingleton();

        // 1. Приватный конструктор — никто снаружи не сделает "new"
        private EagerSingleton() {}

        // 2. Глобальная точка доступа
        public static EagerSingleton getInstance() {
            return INSTANCE;
        }
    }

====================================================
-- 2. LazySingleton (doublecheck) with ThreadSafe --
====================================================
    public class DoubleCheckedLockingSingleton {
        // [volatile] критически важен! Он гарантирует, что изменения переменной 
        // будут сразу видны всем потокам, и предотвращает перестановку инструкций в CPU
        private static volatile DoubleCheckedLockingSingleton instance;

        private DoubleCheckedLockingSingleton() {}

        public static DoubleCheckedLockingSingleton getInstance() {
            // Первая проверка чтобы потоки входили в syncronized по одному 
            if (instance == null) {
                synchronized (DoubleCheckedLockingSingleton.class) {
                    // Вторая проверка (уже под защитой монитора)
                    if (instance == null) {
                        instance = new DoubleCheckedLockingSingleton();
                    }
                }
            }
            return instance;
        }
    }

==================
-- 3. Bill Pugh --
==================
    > Тип: LazySingleton
    > Потокобезопастный без synchronized

    public class BillPughSingleton {    
        // 1. Приватный конструктор
        private BillPughSingleton() {}

        // 2. Внутренний статический класс-держатель.
        // JVM загрузит его и создаст INSTANCE только при вызове getInstance()
        private static class SingletonHolder {
            private static final BillPughSingleton INSTANCE = new BillPughSingleton();
        }

        // 3. Получение экземпляра
        public static BillPughSingleton getInstance() {
            return SingletonHolder.INSTANCE;
        }
    }

=============
-- 4. Enum --
=============
    > Тип: EagerSingleton
    > Нельзя наследоваться, потокобезопастный
    
    public enum EnumSingleton {
        INSTANCE; // Единственный экземпляр

        // Сюда можно добавлять любые методы и поля
        public void doSomething() {
            System.out.println("Работает синглтон-энум!");
        }
    }