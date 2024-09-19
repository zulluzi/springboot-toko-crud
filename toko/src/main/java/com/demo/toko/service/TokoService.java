package com.demo.toko.service;

import com.demo.toko.model.Toko;

import java.util.List;
public interface TokoService {
    Toko addToko(Toko toko);
    List<Toko> getAllToko();
    Toko getTokoByIndex(int index);
    Toko updateToko(int index, Toko toko);
    String deleteToko(int index);
}
