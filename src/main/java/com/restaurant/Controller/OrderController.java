package com.restaurant.Controller;

import java.util.Optional;

import com.restaurant.Domain.Order;
import com.restaurant.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class OrderController {

	@Autowired
	private OrderRepository orderRepository;

	@GetMapping("/")
	public String indexPage(Model model, @RequestParam(defaultValue="0") int page){
		model.addAttribute("data", orderRepository.findAll(new PageRequest(page, 4)));
		model.addAttribute("currentPage", page);
	    return "index";
	}
	
	@PostMapping("/save")
	public String save(Order order) {
		orderRepository.save(order);
		return "redirect:/";
	}
	
	@GetMapping("/delete")
	public String deleteOrder(Integer order_id) {
		orderRepository.deleteById(order_id);
		return "redirect:/";
	}
	
	@GetMapping("/findOne")
	@ResponseBody
	public Optional<Order> findOne(Integer id) {
		return orderRepository.findById(id);
	}
}
