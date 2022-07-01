import models.Pavillon;
import services.IService;
import services.ServiceTableau;

public class App {
    public static void main(String[] args) throws Exception {

        IService service = new ServiceTableau();

        String choice = "0";
        while (Integer.parseInt(choice) < 5) {
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
                choice = System.console().readLine("Enter choix > ");
                System.out.println("");
                try {

                    switch (choice) {

                        case "1":
                            int nbreEtage = Integer.parseInt(System.console().readLine("Entrer le nombre d'etage du pavillon : "));
                            Pavillon pavillon = new Pavillon();
                            pavillon.setNombreEtage(nbreEtage);
                            service.ajouterPavillon(pavillon);
                            break;

                        case "2":
                            System.out.println("====================== Liste des Pavillons ==========================");
                            service.listerPavillon();
                            break;

                        case "3":

                            System.out.println("====== Type de chambres ======");
                            System.out.println("");
                            System.out.println("Options:");
                            System.out.println("1- Individuelle");
                            System.out.println("2- Double");
                            System.out.println("");
                            String typeChambre = System.console().readLine("Choisir type de chambre : ");

                            System.out.println("====== Numero d'etage ======");
                            System.out.println("");
                            System.out.println("Options:");
                            System.out.println("1- Premiere");
                            System.out.println("2- Deuxieme");
                            System.out.println("3- Troisieme");
                            System.out.println("4- Quatrieme");
                            System.out.println("");
                            String numeroEtage = System.console().readLine("Choisir numero d'etage : ");
                            
                            break;

                        case "4":
                            System.out.println("4");
                            break;
                    
                        case "5":
                            System.out.println("GooD BYE");
                            System.exit(1);
                            break;
                    
                        default:
                            System.out.println("Entrer un choix correct!!!");
                            choice = "0";
                            break;
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                
            }
        }
        
}
