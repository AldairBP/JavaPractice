public class ObjectsVsPrimitives {

    public static void main(String[] args) {
        int int1 = 5;
        int int2 = 5;
        boolean primAns;
        boolean ObjAns;

        Integer itg1 = new Integer(5);
        Integer itg2 = new Integer(5);

        // We have an example about the functioning of an object vs a primitive value
        // In this part of the code we proof if the integers are the same as well as the
        // objet Ingeter
        primAns = (int1 == int2) ? true : false;
        ObjAns = (itg1 == itg2) ? true : false;

        // The answer will be printed by the following statement
        System.out.println("Are the primitive values the same? = " + primAns);
        System.out.println("Are the object values the same? = " + ObjAns);

        // In order to obtain the result verification of the objet of been the same
        // value we use the method .equals() comparing itg1 to itg2
        System.out.println("\nIs the value of the objects equal? = " + itg1.equals(itg2));
    }
}