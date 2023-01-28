package com.youkeda.application.art.member.control;

import com.youkeda.application.art.member.model.Department;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test/dep")
public class DepartmentServiceTestControl {

    @GetMapping(path = "/get")
    public Department testGet() {
        Department dep1 = new Department();
        dep1.setId("1");
        dep1.setName("dep1");
        dep1.setSort(1);

        Department dep2 = new Department();
        dep2.setId("2");
        dep2.setName("dep2");
        dep2.setSort(2);

        dep1.addChildren(dep2);
        dep2.setParentId(dep1.getId());

        return dep1;
    }
}
