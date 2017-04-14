package enums;

/**
 *
 * @author Gustavo
 */
public enum EnumThrones {
    STARK{
        @Override
        public void printWords(){System.out.println("Winter is cominng");}
    },
    TARGARYEN{
        @Override
        public void printWords(){System.out.println("Fire and Blood");}
    },
    LANNISTER{
        @Override
        public void printWords(){System.out.println("Hear me Roar");}
    },
    BARATHEON{
        @Override
        public void printWords(){System.out.println("Our is the Fury");}
    },
    GREYJOY{
        @Override
        public void printWords(){System.out.println("We do not Sow");}
    },
    VARYS;
    
    public void printWords(){System.out.println("No words");}
}
