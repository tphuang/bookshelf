package com.thoughtworks.bookshelf.controller;

import com.thoughtworks.bookshelf.model.Shelf;
import com.thoughtworks.bookshelf.service.ShelfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ShelfController {
    private ShelfService shelfService;

    @Autowired
    public ShelfController(ShelfService shelfService) {
        this.shelfService = shelfService;
    }

    @RequestMapping(value = "/shelves", method = RequestMethod.GET)
    public String findAllShelves(ModelMap model) throws Exception {
        List<Shelf> shelfs = new ArrayList<Shelf>();
        shelfs = shelfService.findAllShelves();
        model.addAttribute("shelves",shelfs );
        return "shelves/shelves";
    }

    @RequestMapping(value = "/shelves/show/{id}", method = RequestMethod.GET)
    public String findShelfById(ModelMap model, @PathVariable int id) throws Exception {
        model.addAttribute("shelf", shelfService.findShelfById(id));
        return "shelves/show_shelf";
    }

    @RequestMapping(value = "/shelves/new", method = RequestMethod.GET)
    public String loadNewPage(ModelMap model) throws Exception {
        return "shelves/new_shelf";
    }
}
