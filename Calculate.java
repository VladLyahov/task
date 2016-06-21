import java.util.Arrays;
public class Calculate{

	public static void main(String[] args){
		System.out.println("Calculate");
		//int first = Integer.valueOf(arg[0]);
		//int second = Integer.valueOf(arg[1]);
		//int summ = first + second;
		//System.out.println("summ= " + summ);
		
		
		//String[] elem = arg.split(" ");
        //System.out.println(Arrays.toString(elem));
		
		
		String[] args2 =  new String[args.length+2] ;
        for(int i =0; i<args.length-2;i++){
            args2[i] = args[i];
        }
        args2[args.length-2] = " ";
        args2[args.length-1] = args[args.length-2];
        args2[args.length] = " ";
        args2[args.length+1] = args[args.length-1];
//        args[args.length+1]=args[args.length];
//        args[args.length]=" ";
        StringBuilder sb = new StringBuilder();
        for (String s:args2){
            sb.append(s);
        }
       String argss = sb.toString();
        //String argss = "2.56  + 3";
        //String argss = Arrays.toString(args);

        System.out.println(argss);
        //String[] elem = argss.split(" " +'+'+"\\s*");
        String[] elem = argss.split(" ");
       // String[] elem = elemM[1].split("+ ");

        for (String aa:elem) System.out.println(aa);
        System.out.println(Arrays.toString(elem));
        double a = Double.parseDouble(elem[0]);
        double b = Double.parseDouble(elem[2]);
        if (elem[1].equals("+")){
            System.out.println(a+b);
        } else if (elem[1].equals("-")){
            System.out.println(a-b);
        }else if (elem[1].equals("*")){
            System.out.println(a*b);
        }else  if (elem[1].equals("/")){
            System.out.println(a/b);
        }else System.out.println("error");
	}
}