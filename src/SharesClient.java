
import java.util.Iterator;
import java.util.List;
import org.netbeans.xml.schema.shares.Shareinfo;

public class SharesClient {

  
    public static void main(String[] args) {
        
        
       List<org.netbeans.xml.schema.shares.Shareinfo> myShares = getAllShares();
       
       Iterator itr = myShares.iterator();
        
        Shareinfo nextShare;
        
        while(itr.hasNext()){
            nextShare = (Shareinfo) itr.next();
            System.out.println(nextShare.getCompany());
            }
        }
    

    public static java.util.List<org.netbeans.xml.schema.shares.Shareinfo> getAllShares() {
        org.sharesws.SharesWebService_Service service = new org.sharesws.SharesWebService_Service();
        org.sharesws.SharesWebService port = service.getSharesWebServicePort();
        return port.getAllShares();
    }
    
}
