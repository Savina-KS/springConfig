package com.example.labour.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.labour.model.Labourer;
import com.example.labour.service.LaborService;

@RestController
@RequestMapping("/api")
public class LaborController {

	@Autowired
	private LaborService laborService;

	@PostMapping("/Add-Laborer")
	public Labourer addLabor(@RequestBody Labourer labor) {
		return laborService.saveLabor(labor);

	}

	@GetMapping("/GetByLocation/{location}")
	public List<Labourer> getByLocation(@PathVariable String location) {
		return laborService.getByLocation(location);

	}

	@PutMapping("/Update-Details")
	public Labourer updateDetails(@RequestBody Labourer labour) {
		return laborService.updateLaborDetails(labour);

	}

	@DeleteMapping("/Delete-Details/{id}")
	public String deleteLabourer(@PathVariable int id) {
		return laborService.deleteDetails(id);

	}

	/*@GetMapping("/getPairs/{sum}")
	public void getPairs(@PathVariable int sum) {
		List<Integer> list = Arrays.asList(8, 7, 2, 3, 1);
		
		/*int count = 0;
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i) + list.get(j) == sum) {
					count++;
				}
			}
		}*/
		
	/*	list.stream().reduce((a, b) -> {
		      if (a+b==10) {
		    	  int d= 0;
		    	  d=d+1;
		          return d;
		      } else {
		          return b;
		      }
		  });
		

	}*/

}
