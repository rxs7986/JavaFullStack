class StringRotation {
    /* Function checks if passed strings (str1 and str2)
    are rotations of each other */
    public int areRotations(String str1, String str2) {
        // There lengths must be same and str2 must be
        // a substring of str1 concatenated with str1.
        if ((str1.length() == str2.length())
                && ((str1 + str1).contains(str2)))
                {
                    return 1;
                    
                }
                
                else 
                {
                return 0;
                }
    }

    // Driver code
    public static void main(String[] args) {
        String str1 =  "JavaJ2eeStrutsHibernate";
        String str2 =  "StrutsHibernateJavaJ2ee";
        
        StringRotation obj = new StringRotation();
        

        // Function call
        if (obj.areRotations(str1, str2)==1)
            System.out.println(str1 + "\n"+ str2  + "\n" +"are rotations of each other");
        else
            System.out.printf(str1 + "\n"+ str2  + "\n+"+ "are not rotations of each other");
    }
}
