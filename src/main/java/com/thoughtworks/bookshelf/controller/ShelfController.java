package com.thoughtworks.bookshelf.controller;

import com.thoughtworks.bookshelf.model.Shelf;
import com.thoughtworks.bookshelf.service.ShelfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class ShelfController {
    private ShelfService shelfService;

    @Autowired
    public ShelfController(ShelfService shelfService) {
        this.shelfService = shelfService;
    }

    @RequestMapping(value = "shelves", method = RequestMethod.GET)
    public String findAllShelves(ModelMap model) throws Exception {
        List<Shelf> shelfs = new ArrayList<Shelf>();
        shelfs = shelfService.findAllShelves();
        model.addAttribute("shelves",shelfs );
        return "shelves/shelves";
    }

    @RequestMapping(value = "shelves/show/{id}", method = RequestMethod.GET)
    public String findShelfById(ModelMap model, @PathVariable long id) throws Exception {
        model.addAttribute("shelf", shelfService.findShelfById(id));
        return "shelves/show_shelf";
    }

    @RequestMapping(value = "shelves/new", method = RequestMethod.GET)
    public String loadNewPage(ModelMap model) throws Exception {
        model.addAttribute("shelf", new Shelf());
        return "shelves/new_shelf";
    }

    @RequestMapping(value = "shelves/create", method = RequestMethod.POST)
    public String addShelf(@ModelAttribute("shelf") Shelf shelf, ModelMap model) throws Exception {
        shelfService.createShelf(shelf);
        return "redirect:/shelves";
    }

    @RequestMapping(value = "shelves/edit/{id}", method = RequestMethod.GET)
    public String loadEditPage(@PathVariable long id, ModelMap model) throws Exception {
        Shelf shelf = shelfService.findShelfById(id);
        model.addAttribute("shelf", shelf);
        return "shelves/edit_shelf";
    }

    @RequestMapping(value = "shelves/update", method = RequestMethod.POST)
    public String updateShelf(@ModelAttribute("shelf") Shelf shelf) throws Exception {
        shelfService.updateShelf(shelf);
        return "redirect:/shelves";
    }

    @RequestMapping(value = "shelves/delete/{id}", method = RequestMethod.GET)
    public String deleteShelf(@PathVariable long id, ModelMap model) throws Exception {
        shelfService.deleteShelfById(id);
        return "redirect:/shelves";
    }
}
