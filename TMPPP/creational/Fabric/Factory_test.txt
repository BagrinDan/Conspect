

- Explicare sablon:
    Intent:
        - Фабричный метод - это порождающий паттерн, который
        позволяет создавать новые объекты за счет полиморфизма.

    Сazuri de utilizare;
        - Когда нужно создавать классы избегая if-else
        - Инкапсулировать создание объекта
    
    Diagrame UML
    
    Explicarea claselor componente:

        [Abstract Factory] - интерфейс который имеет метод создания.
        Каждя фабрика будет объязана создавать продукты

        [ConcreteFactory] - конкретная фабрика которая создает конкретный
        объект 

        [Abstract Product] - абстрактное представление продукта

        [Product] - конкретный продукт



    Exemplificati:
        - Пример: Создания пиццы:

            [AbstractFactory]     
            // Это интерфейс фабрик, которые будут создавать
            // продукты   
            public interface FactoryService{
                Pizza create();
            }


            [ConcreteFactory]
            // Конкретная фабрика что создает конкретный объект типа
            // Peperoni()
            public class PeperoniFactory implements FactoryService{

                @Override
                public Pizza create(){
                    return new Peperoni();
                }
            }


            [Abstract Product]
            // Абстрактный класс Пиццы. Содержит названия и цену
            // Уже каждый класс который будет наследоваться через
            // данный класс переопреедлить атрибуты
            @Getter
            abstract class Pizza{
                protected String name;
                protected double price;
            }


            [ConcreteProduct]
            // Конкретный продукт который имеет цену и названия
            // price = конкретная цена пеперони
            // name = название пиццы
            @Getter
            class Peperoni extends Pizza{
                public Peperoni(){
                    this.price = 0.99;
                    this.name = "Peperoni"; 
                }
            }

            class Main{
                public static void main(String[] args){
                    AbstractFactory abs = new PeperoniFactory()

                    Pizza pizza = abs.create()

                    System.out.printl(pizza.getName() + ", " + pizza.getPrice())
                }
            } 

    Ex 3

        LSP - принцип барбары лисков который гласит что дочерний класс должен уметь заменить родительский класс без ошибок
        DIP - принцип обратной инверсии который гласит что класс высоких уровней должны работать с низкими через абстакцию

        LSP / DIP

            LSP (До)
                abstract class Bird{
                    public abstract void fly();
                }

                class Penguin extends Bird{
                    @Override
                    public void fly(){
                        System.out.println("Flying...?") // Ошибка: Пингвин не летает
                    }
                }
            
            LSP (после)
                public interface Flyable{
                    void fly;
                }

                class CanFly implements Flyable{
                    @Override
                    public void fly(){
                        sout("Can fly")
                    }
                }   

                class NoFly implements Flyable{
                    @Override
                    public void fly(){
                        sout("Can't fly")
                    }
                }  

                abstract class Bird{
                    Flyable fly;

                    public Bird(Flyable fly){
                        this.fly = fly;
                    }

                    public void fly(){
                        fly.fly();
                    }
                }

            DIP (До)

            class CoffeeServiceImpl{
                public Coffee makeCoffee(){
                    return Americano();
                }
            }

            @RestController
            @GetMapping("/coffee")
            @AllArgsConstruct
            class CoffeeController{
                public CoffeeServiceImpl coffee;

                @GetMapping("/make_coffee")
                public String makeCoffee(){
                    this.coffee.makeCoffee();

                    return "redirect:/";
                }
            }


            DIP (После)

            public interface CoffeeService(){
                Coffee makeCoffee();
            }

            class CoffeeServiceImpl implements CoffeeService{
                @Override
                public Coffee makeCoffee(){
                    return Americano();
                }
            }

            @RestController
            @GetMapping("/coffee")
            @AllArgsConstruct
            class CoffeeController{
                public CoffeeService coffee;

                @GetMapping("/make_coffee")
                public String makeCoffee(){
                    this.coffee.makeCoffee();

                    return "redirect:/";
                }
            }

            
        

    