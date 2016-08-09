public class Q {

/*
    int min = x < y ? x < z ? x : z : y < z ? y : z;
    returnString="Thank you "+(person.isMale()?"Mr. ":"Ms. ")+person.getLastName()+".";
    return a!=null?a.length:0;

    telNumber.matches("^\\+?\\d?\\d?\\(?\\d{3}\\)?-?\\d{3}-?\\d{2}-?\\d{2}");

    SortedMap<String, Charset> charsets = Charset.availableCharsets();

    Charset currentCharset = Charset.defaultCharset();

    Collections.sort(listStrings,Collections.reverseOrder());
*/

        public static void main(String[] args) {
            try{
                hello();
            }
            catch(MyException me){
                System.out.println(me);
            }
        }

        static void hello() throws MyException{
            int[] dear = new int[7];
            dear[0] = 747;
            foo();
        }

        static void foo() throws MyException{
            throw new MyException("Exception from foo");
        }
    }

    class MyException extends Exception {
        public MyException(String msg){
            super(msg);
        }
    }
