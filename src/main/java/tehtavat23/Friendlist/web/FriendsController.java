package tehtavat23.Friendlist.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import tehtavat23.Friendlist.domain.Friends;


@Controller
public class FriendsController {
	
	private List<Friends> friends = new ArrayList<>();
	
	@GetMapping("/index")
	public String showFriends(Model model) {
		System.out.println("Friends");
		model.addAttribute("friend", new Friends());	
		model.addAttribute("friends", friends);
		return "friendlist";
	}
	
	@PostMapping("/submitfriend")
	public String submitFriend(@ModelAttribute Friends friend) {
		friends.add(friend);
		return "redirect:/index";
	}
	


}
