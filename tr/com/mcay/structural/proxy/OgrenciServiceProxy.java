package tr.com.mcay.structural.proxy;

import java.util.HashMap;
import java.util.Map;

public class OgrenciServiceProxy implements IOgrenciService {
    private OgrenciService ogrenciService;
    private Map<Integer, Ogrenci> cache;

    public OgrenciServiceProxy() {
        this.ogrenciService = new OgrenciService();
        this.cache = new HashMap<>();
    }

    @Override
    public Ogrenci getOgrenciBilgileri(int id) {
        if (cache.containsKey(id)) {
            System.out.println("OgrenciServiceProxy: Önbellekten öğrenci bilgileri getiriliyor...");
            return cache.get(id);
        } else {
            System.out.println("OgrenciServiceProxy: Önbellekte bulunamadı, gerçek servise yönlendiriliyor...");
            Ogrenci ogrenci = ogrenciService.getOgrenciBilgileri(id);
            if (ogrenci != null) {
                cache.put(id, ogrenci);
            }
            return ogrenci;
        }
    }
} 