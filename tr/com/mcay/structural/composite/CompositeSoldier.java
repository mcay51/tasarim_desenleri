package tr.com.mcay.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite sınıfı - Alt bileşenleri içeren ve yöneten bileşen
 * Bir birliği veya komutanı temsil eder, kendi altında başka askerler bulunabilir
 */
public class CompositeSoldier implements ISoldier {
    private List<ISoldier> soldiers = new ArrayList<>();
    private String name;
    private String rank;
    
    /**
     * CompositeSoldier sınıfı için constructor
     * @param name birlik/komutan adı
     * @param rank birlik/komutan rütbesi
     */
    public CompositeSoldier(String name, String rank) {
        this.name = name;
        this.rank = rank;
    }
    
    /**
     * Birliğe yeni bir asker ekler
     * @param soldier eklenecek asker
     */
    public void add(ISoldier soldier) {
        soldiers.add(soldier);
    }
    
    /**
     * Birlikten bir askeri çıkarır
     * @param soldier çıkarılacak asker
     */
    public void remove(ISoldier soldier) {
        soldiers.remove(soldier);
    }
    
    @Override
    public void executeOrder() {
        System.out.println(rank + " " + name + " emri aldı ve birliğine iletiyor!");
        
        // Alt birimlere emri ilet
        for (ISoldier soldier : soldiers) {
            soldier.executeOrder();
        }
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