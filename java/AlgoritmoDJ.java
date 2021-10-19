import java.util.ArrayList;
import java.util.Arrays;
/**
 *     Ivestigacion de Operaciones ISC F-53
 *  @author Hernandez Estudillo Itzel Mitzi
 *    Programa: Algoritmo Dijkstra's
 */
class AlgoritmoDJ{
    /**
     * @about:
     * En este metodo se iniciara sel setup del algoritmo
     */
    public void init(){
        this.start();
    }
    /**@about: 
     * En este metodo se incia el algoritmo
     */
    private void start(){
        System.out.println("Comenzando....");
        Objeto objetito = new Objeto();
        objetito.setVisible(true);
        objetito.addVertax(" A ");
        objetito.addVertax(" B ");
        objetito.addVertax(" C ");
        objetito.addVertax(" D ");
        objetito.addVertax(" E ");

        objetito.addEdges(0, 1, 10);
        objetito.addEdges(0, 2, 2);
        objetito.addEdges(2, 1, 1);
        objetito.addEdges(2, 4, 7);
        objetito.addEdges(1, 4, 1);
        objetito.addEdges(4, 3, 3);

        showEdges();
        objetito.dijkStra(0);
    }

    private int n;
    private int numberOfEdges;
    private double[] distance;
    private String[] path;
    private ArrayList<String> Vertax;
    private static int[][] edges;
    private boolean[] isVisited;
    public  objet(int n){
        this.n = n;
        numberOfEdges=0;
        Vertax = new ArrayList<>(n);
        edges  = new int[n][n];
        isVisited = new boolean[n+1];
        distance = new double[n];
        for (int i = 0; i <n ; i++) {
            distance[i] = Double.POSITIVE_INFINITY;
        
            path = new String[n];
            for (int i = 0; i <n ; i++) {
                path[i] = "";
            }
        }
    }
    public static void showEdges(){
        for (int[] edse: edges
        ) {
            System.out.println(Arrays.toString(edse));
        }
    }
    public static void main(String[] args) {
        AlgoritmoDJ algoritmoDJ = new AlgoritmoDJ();
        algoritmoDJ.init();
    }
}