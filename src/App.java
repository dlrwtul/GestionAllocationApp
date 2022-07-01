import models.Pavillon;
import services.IService;
import services.ServiceTableau;

public class App {
    public static void main(String[] args) throws Exception {

        IService service = new ServiceTableau();

        System.out.println("===================== GESTION CODIFICATION APP ====================");
        System.out.println("");
        System.out.println("Options:");
        System.out.println("1- Ajouter Pavillon");
        System.out.println("2- Lister Pavillons");
        System.out.println("3- Ajouter Chambre");
        System.out.println("4- Lister Chambres");
        System.out.println("5- Quitter");
        System.out.println("");
        System.out.println("================================================");
        System.out.println("");
        String name = System.console().readLine("Enter choix > ");
        System.out.println("");
        try {

            switch (name) {

                case "1":
    
                    int nbreEtage = Integer.parseInt(System.console().readLine("Enter le nombre d'etage du pavillon : "));
                    Pavillon pavillon = new Pavillon();
                    pavillon.setNombreEtage(nbreEtage);
                    service.ajouterPavillon(pavillon);

                    break;

                case "2":
                    System.out.println("2");
                    break;

                case "3":
                    System.out.println("3");
                    break;

                case "4":
                    System.out.println("4");
                    break;
            
                case "5":
                    System.out.println("GooD BYE");
                    System.exit(1);
                    break;
            
                default:
                    System.exit(1);
                    break;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
}
