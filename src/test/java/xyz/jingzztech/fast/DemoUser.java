/**
 * 
 */
package xyz.jingzztech.fast;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @author jingzz
 * @time 2016年3月30日 下午1:53:14
 * @name fastjson/xyz.jingzztech.fast.DemoUser
 * @since 2016年3月30日 下午1:53:14
 */
public class DemoUser {
	
	private String _name;
	
	private String name;
	
	private String id;
	
	public String xixi;
	
	@JSONField(serialize=true)
	public String content;

	//通过该注解可以解决下划线问题
	@JSONField(name="_name")
	public String get_name() {
		return _name;
	}

	public void set_name(String _name) {
		this._name = _name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "DemoUser [name=" + name + ", id=" + id + "]";
	}
	
}
