import models.Chambre;
import models.Pavillon;
import models.TypeChambre;
import models.TypeEtage;
import services.IService;
import services.ServiceTableau;

public class App {
    public static void main(String[] args) throws Exception {

        IService service = new ServiceTableau();

        int choice = 0;
        while (choice < 5) {
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
                choice = Integer.parseInt(System.console().readLine("Enter choix > "));
                System.out.println("");
                try {

                    switch (choice) {

                        case 1:
                            int nbreEtage = Integer.parseInt(System.console().readLine("Entrer le nombre d'etage du pavillon : "));
                            if (nbreEtage >=0 || nbreEtage <5) {
                                Pavillon pavillon = new Pavillon();
                                pavillon.setNombreEtage(nbreEtage);
                                service.ajouterPavillon(pavillon);
                            } else {
                                System.console().readLine("Soyez serieux : ");
                            }
                            break;

                        case 2:
                            System.out.println("====================== Liste des Pavillons ==========================");
                            service.listerPavillon();
                            break;

                        case 3:
                            Chambre chambre = new Chambre();
                            int typeChambre = 0;
                            
                            while (typeChambre == 0) {

                                System.out.println("====== Type de chambres ======");
                                System.out.println("");
                                System.out.println("Options:");
                                System.out.println("1- Individuelle");
                                System.out.println("2- Double");

                                System.out.println("");
                                typeChambre = Integer.parseInt(System.console().readLine("Choisir type de chambre : "));
                                System.out.println("");

                                switch (typeChambre) {
                                    case 1:
                                        chambre.setType(TypeChambre.INDIVIDUELLE);
                                        break;
                                
                                    case 2:
                                        chambre.setType(TypeChambre.DOUBLE);
                                        break;
                                    
                                    default:
                                        System.out.println("Entrer un choix correct!!!");
                                        typeChambre = 0;
                                        break;
                                }
                            }
                            
                            int numeroEtage = 0;

                            while (numeroEtage == 0) {

                                System.out.println("====== Numero d'etage ======");
                                System.out.println("");
                                System.out.println("Options:");
                                System.out.println("1- Premiere");
                                System.out.println("2- Deuxieme");
                                System.out.println("3- Troisieme");
                                System.out.println("4- Quatrieme");

                                System.out.println("");
                                numeroEtage = Integer.parseInt(System.console().readLine("Choisir numero d'etage : "));
                                System.out.println("");

                                switch (numeroEtage) {
                                    case 1:
                                        chambre.setEtage(TypeEtage.PREMIERE);
                                        break;
                                    case 2:
                                        chambre.setEtage(TypeEtage.DEUXIEME);
                                        break;
                                    case 3:
                                        chambre.setEtage(TypeEtage.TROISIEME);
                                        break;
                                    case 4:
                                        chambre.setEtage(TypeEtage.QUATRIEME);
                                        break;
                                    default:
                                        System.out.println("Entrer un choix correct!!!");
                                        typeChambre = 0;
                                        break;
                                }
                            }
                            
                            int idPavillon = Integer.parseInt(System.console().readLine("Entrer id du pavillon : "));
                            service.affecterChambrePavillon(idPavillon, chambre);
                            service.ajouterChambre(chambre);
                        case 4:
                            System.out.println("4");
                            break;
                    
                        case 5:
                            System.out.println("GooD BYE");
                            System.exit(1);
                            break;
                    
                        default:
                            System.out.println("Entrer un choix correct!!!");
                            choice = 0;
                            break;
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                
            }
        }
        
}
