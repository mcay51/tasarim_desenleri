package tr.com.mcay.structural.composite;

/**
 * Leaf (Yaprak) sınıfı - Hiyerarşinin en alt seviyesindeki nesneleri temsil eder
 * Kompozit olmayan, tekil askerleri temsil eder
 */
public class PrimitiveSoldier implements ISoldier {
    private String name;
    private String rank;
    
    /**
     * PrimitiveSoldier sınıfı için constructor
     * @param name askerin adı
     * @param rank askerin rütbesi
     */
    public PrimitiveSoldier(String name, String rank) {
        this.name = name;
        this.rank = rank;
    }
    
    @Override
    public void executeOrder() {
        System.out.println(rank + " " + name + " emri yerine getiriyor!");
    }
    
    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public String getRank() {
        return rank;
    }
} 