package SingleResponsibility;

public class SingleResponsibilityExample {

    /////////////////  Single Responsibility Prensibine Aykırı /////////////////////
    public class FullStackDeveloper
    {
        public void WriteJavaCode()
        {
            System.out.println("I can write Java.");
        }

        public void WriteSQLCode()
        {
            System.out.println("I can write SQL.");
        }

        public void WriteJavaScriptCode()
        {
            System.out.println("I can write JavaScript.");
        }

        public void WriteCSSCode()
        {
            System.out.println("I can write CSS.");
        }
    }
    /////////////////// Single Responsibility Prensibine Uygun ///////////////

    public class BackEndDeveloper
    {
        public void WriteJavaCode()
        {
            System.out.println("I can write Java.");
        }
    }

    public class FrontEndDeveloper
    {
        public void WriteJavaScriptCode()
        {
            System.out.println("I can write JavaScript.");
        }

        public void WriteCSSCode()
        {
            System.out.println("I can write CSS.");
        }
    }

    public class SQLDeveloper
    {
        public void WriteSQLCode()
        {
            System.out.println("I can write SQL.");
        }
    }
}
