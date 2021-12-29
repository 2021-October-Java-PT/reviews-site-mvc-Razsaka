package org.wecancoeit.reviews;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class ReviewController {
    @Resource
    private ReviewRepository reviewRepo;

    @RequestMapping("/")
    public String homePage(){
        return "home.html";
    }

    @RequestMapping("/reviews")
    public String findAllStudents(Model model) {
        model.addAttribute("reviewsModel", reviewRepo.findAll());
        return "ReviewsTemplate";
    }

    @RequestMapping("/reviews/{id}")
    public String findOneReview(@PathVariable Long id, Model model)  {
        model.addAttribute("reviewModel", reviewRepo.findOne(id));
        return "ReviewTemplate";
    }

}


