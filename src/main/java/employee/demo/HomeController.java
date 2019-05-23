package employee.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

public class HomeController {

    @Autowired
    DepartmentRepo departmentRepo;

    @RequestMapping("/")
    public String listCourse (Model model){
        model.addAttribute("Department",DepartmentRepo.findAll());
        return "list";

        @GetMapping("/add")
        public String EmployeeForm(Model model){
            model.addAttribute("message",new employee());
            return "form";
        }

        @PostMapping("/process")
        public String processForm(@Valid Message employee, BindingResult result){
            if (result.hasErrors()){
                return "form";
            }
            EmployeeRepo.save(employee);
            return "redirect:/";
        }

        @RequestMapping("/detail/{id}")
        public String showEmployee(@PathVariable("id") long id, Model model){
            model.addAttribute("message", EmployeeRepo.findById(id).get());
            return "show";
        }

        @RequestMapping("/update/{id}")
        public String updateEmployee(@PathVariable("id") long id, Model model){
            model.addAttribute("message",EmployeeForm.findById(id).get());
            return "form";
        }

        @RequestMapping("/delete/{id}")
        public String delMessage(@PathVariable("id") long id){
            EmployeeRepo.deleteById(id);
            return "redirect:/";
    }

}

