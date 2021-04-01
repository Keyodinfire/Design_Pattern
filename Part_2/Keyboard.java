package Part_2;

public class Keyboard implements ComputerPart{
    
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor)
    {computerPartVisitor.visit(this);}
}
