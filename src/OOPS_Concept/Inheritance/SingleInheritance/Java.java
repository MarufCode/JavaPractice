package src.OOPS_Concept.Inheritance.SingleInheritance;

public class Java extends Programming {

   String newFeature;



   Java(){
       System.out.println("DC - JAVA");
   }


   Java(String feature){
       this.newFeature = feature;
   }


   void printInfo(){
       System.out.println("Feature is -> " + this.newFeature);
       System.out.println("Author is -> " + this.author);
   }

}
