package org.example.ahhomeservice.Controller;



import org.example.ahhomeservice.Model.AllServices;
import org.example.ahhomeservice.Model.Category;
import org.example.ahhomeservice.Model.SubCategory;
import org.example.ahhomeservice.Model.User;
import org.example.ahhomeservice.Service.AllServiceService;
import org.example.ahhomeservice.Service.CategoryService;
import org.example.ahhomeservice.Service.SubCategoryService;
import org.example.ahhomeservice.Service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller("admindashboard")
public class DashboardController {

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private SubCategoryService subCategoryService;

    @Autowired
    private UserServiceImpl userService;

    @Autowired
    private AllServiceService allServiceService;

    @GetMapping("/admin/dashboard")

    public String dashboard(Model model){
        Long categories = categoryService.countall();

        Long subCategories = subCategoryService.countall();
        Long users = userService.countall();
        Long allServices = allServiceService.countall();

        model.addAttribute("categories", categories);
        model.addAttribute("subcategories", subCategories);
        model.addAttribute("allservices", allServices);
        return "admin/dashboard";
    }

}
