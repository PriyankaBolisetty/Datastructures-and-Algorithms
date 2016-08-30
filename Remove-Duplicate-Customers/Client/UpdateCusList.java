package cusutilities.client;

import java.util.*;
import cusutilities.cusdata.*;
import cusutilities.cusdb.*;  // For testing purposes only

/* We have a list of Customers (origCusList).   We have a list of customers who
   have recently ordered (recentOrders).   Some of the customers in recentOrders are
   new customers, some are old. We want to add the new customers to origCusList and 
   create a new Customer list (mergedList).   There should not be any duplicates in
   mergedList.   Thus if a Customer is in both the origCusList and the recentOrders list,
   then we should find the Customer only once in the merged list (not twice!).
*/
public class UpdateCusList {

    public static void main(String[] args) {
         ArrayList<Customer> origCusList;
         ArrayList<Customer> recentOrders;
         ArrayList<Customer> mergedList;
         
         origCusList = CustomerDb.readOrigList();
         recentOrders = CustomerDb.readRecentOrderList();

         mergedList = mergeCusLists(origCusList, recentOrders);
         print(mergedList);
         
         //Remove duplicates using a Set
         Set<Customer> customerSet = new HashSet<Customer>();
         
         customerSet.addAll(mergedList);
         print(customerSet);
         
         //Sorting the customers alphabetically
         customerSet = new TreeSet<Customer>();
         customerSet.addAll(mergedList);
         print(customerSet);
    }

    public static ArrayList<Customer> mergeCusLists(ArrayList<Customer> origCusList, ArrayList<Customer> recCusList) {
         ArrayList<Customer> mergedList;
         Iterator<Customer> cusIterator;
         Customer cus;

         mergedList = new ArrayList<Customer>();
         
         cusIterator = origCusList.iterator();
         while (cusIterator.hasNext()) {
             cus = cusIterator.next();
             mergedList.add(cus);
         }
         
         cusIterator = recCusList.iterator();
         while (cusIterator.hasNext()) {
             cus = cusIterator.next();
             mergedList.add(cus);
         }

         return mergedList;
    }

    public static void print(ArrayList<Customer> cusList) {
        Iterator<Customer> cusIterator;
        Customer cus;

        System.out.println("*** Merged Customer List ***");
        cusIterator = cusList.iterator();
        while (cusIterator.hasNext()) {
            cus = cusIterator.next();
            cus.print();
        }

        System.out.println("*** End List ***");
   }
    
    public static void print(Set<Customer> cusSet){
    	Iterator<Customer> cusIterator = cusSet.iterator();
    	Customer cust;
    	
    	System.out.println("\n*** Customer List without duplicates ***\n");
    	while(cusIterator.hasNext()){
    		cust = cusIterator.next();
    		cust.print();
    	}
    	System.out.println("\n*** End List ***\n");
    }
}

