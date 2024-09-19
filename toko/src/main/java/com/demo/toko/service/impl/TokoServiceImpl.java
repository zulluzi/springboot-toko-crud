package com.demo.toko.service.impl;

import com.demo.toko.model.Toko;
import com.demo.toko.service.TokoService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class TokoServiceImpl implements TokoService {

    private List<Toko> tokoList = new ArrayList<>();

    @Override
    public Toko addToko(Toko toko) {
        toko.setCreatedAt(LocalDateTime.now());
        tokoList.add(toko);
        return toko;
    }

    @Override
    public List<Toko> getAllToko() {
        return tokoList;
    }

    @Override
    public Toko getTokoByIndex(int index) {
        return tokoList.get(index);
    }

    @Override
    public Toko updateToko(int index, Toko toko) {
        Toko existingToko = tokoList.get(index);
        existingToko.setNamaMakanan(toko.getNamaMakanan());
        existingToko.setHarga(toko.getHarga());
        existingToko.setQuantity(toko.getQuantity());
        existingToko.setUpdatedAt(LocalDateTime.now());
        return existingToko;
    }

    @Override
    public String deleteToko(int index) {
        Toko toko = tokoList.get(index);
        toko.setDeletedAt(LocalDateTime.now());
        tokoList.remove(index);
        return "makanan Berhasil di hapus";
    }
}
