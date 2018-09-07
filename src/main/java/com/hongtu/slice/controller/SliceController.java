package com.hongtu.slice.controller;

import com.hongtu.slice.App;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/")
public class SliceController {
    @RequestMapping(value = "/getTileSource", method = RequestMethod.GET)
    public byte[] getTileSource(@RequestParam("level") Integer level, @RequestParam("x") Integer x, @RequestParam("y") Integer y) throws IOException {
        return App.mdsFile.GetTileData(level, x, y);
    }
}
