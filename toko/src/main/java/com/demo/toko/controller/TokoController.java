package com.demo.toko.controller;

import com.demo.toko.model.Toko;
import com.demo.toko.service.TokoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/toko")
public class TokoController {
    @Autowired
    private TokoService tokoService;

    @PostMapping("/add")
    public ResponseEntity<Toko> addToko(@RequestBody Toko toko) {
        Toko createdToko = tokoService.addToko(toko);
        return ResponseEntity.ok(createdToko);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Toko>> getAllToko() {
        List<Toko> tokoList = tokoService.getAllToko();
        return ResponseEntity.ok(tokoList);
    }

    @GetMapping("/{index}")
    public ResponseEntity<Toko> getTokoByIndex(@PathVariable int index) {
        Toko toko = tokoService.getTokoByIndex(index);
        return ResponseEntity.ok(toko);
    }

    @PutMapping("/update/{index}")
    public ResponseEntity<Toko> updateToko(@PathVariable int index, @RequestBody Toko toko) {
        Toko updatedToko = tokoService.updateToko(index, toko);
        return ResponseEntity.ok(updatedToko);
    }

    @DeleteMapping("/delete/{index}")
    public ResponseEntity<String> deleteToko(@PathVariable int index) {
        String message = tokoService.deleteToko(index);
        return ResponseEntity.ok(message);
    }
}
