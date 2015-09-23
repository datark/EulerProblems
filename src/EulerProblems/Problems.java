package EulerProblems;

/**
 * @author Damian Tarka
 */
public class Problems {

    /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     * @throws java.lang.InstantiationException
     * @throws java.lang.IllegalAccessException
     */
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {      
        int[] allProblems = {10};
            for (int i : allProblems)
                try {
                    ((Problem) Class.forName("EulerProblems.Problem"+ i).newInstance()).execute();
                }
                catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
                    //Logger.getLogger(Problems.class.getName()).log(Level.SEVERE, null, ex);            
                }
    }
}
