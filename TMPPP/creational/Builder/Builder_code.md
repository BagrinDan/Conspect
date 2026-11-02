
=================
**[NO DIRECTOR]**
=================

// [Class Product] - базовый класс

    public class Vacantion{
        public String hotel;

        private Vacantion() {}

        public void setHotel(String hotel){
            this.hotel = hotel;
        }
    }



// [Abstract Builder] - абстрактный билдер

    public abs class VacantionBuilder{
        protected Vacantion vacantion = new Vacantion(); // Объект которого мы будем строить

        public abstract VacantionBuilder addHotel(String hotelName);
        ...

        public Vacantion getVacantion(){
            return vacantion;
        }

        public Vacation build() {
            return this.vacation1;
        }

    }

// [Concrete Builder] - конкретный билдер

    public class ConcreteVacantionBuilder extends VacantionBuilder{
        @Override
        public VacantionBuilder addHotel(String hotelName){
            this.vacantion.setName("..." + hotelName);
            return this;
        }
    }


// [CLIENT]

public main() {
    VacantionBuilder builder = new VacantionBuilder();

    Vacantion trip = builder
        .addHotel("Trivago")
        ...
        getVacantion(); 
}

// [DIRECTOR]

    public class VacationDirector {
        private VacationBuilder builder

        public VacationDirector(VacationBuilder builder){
            this.builder = builder;
        }

        // Family 
        public Vacation constructFamiylyVacation(){
            return builder.addHotel(...)
                        ...
                        .getVacation();
        }

        // Basic
        public getVacantionion constructQuickTrip(){
            return builder.addHotel(...)
                        .getVacantion()
        }
    }


=====================
** [WITH DIRECTOR] **
=====================

// [MAIN]

public main(){
    // BUILDER
    VacationBuilder builder = new CocreteVacationBuilder();

    // DIRECTOR
    VacationDirector director = new VacationDirector(builder);

    Vacation trip = director.constructFamiylyVacation()

    sout(trip);
}


