function inti() {
	dwr.util.useLoadingMessage();
	fillTable();
}
var peopleCache = {};
var viewed = -1;

function fillTable() {
	userbizimpl.getUserList(function(people) {
		// people={id:"1",username:"zhangsan",password:"111"};
			dwr.util.removeAllRows("peoplebody", {
				filter : function(tr) {
					return (tr.id != "pattern");
				}
			});
			// Create a new set cloned from the pattern row
			var person, id;
			people.sort(function(p1, p2) {
				return p1.username.localeCompare(p2.username);
			});// list排序
			for ( var i = 0; i < people.length; i++) {
				person = people[i];
				id = person.id;
				dwr.util.cloneNode("pattern", {
					idSuffix : id
				});
				dwr.util.setValue("tableID" + id, person.id);// person.id
				// 对应实体类属性
				dwr.util.setValue("tableName" + id, person.username);
				dwr.util.setValue("tablePassword" + id, person.password);
				dwr.util.byId("pattern" + id).style.display = "";
				peopleCache[id] = person;
			}
		});
	
}
/*function deleteClicked(eleid) {
	  // we were an id of the form "delete{id}", eg "delete42". We lookup the "42"
	  var person = peopleCache[eleid.substring(6)];
	  if (confirm("Are you sure you want to delete " + person.username+ "?")) {
	    dwr.engine.beginBatch();
	    People.deletePerson(person);
	    fillTable();
	    dwr.engine.endBatch();
	  }
	}*/


function editClicked(eleid) {
	// we were an id of the form "edit{id}", eg "edit42". We lookup the "42"
	var person = peopleCache[eleid.substring(4)];
	dwr.util.setValues(person);
	
}

function writePerson() {
	  var person = {id:null, username:null, password:null };
	  dwr.util.getValues(person);
	  dwr.engine.beginBatch();
	  userbizimpl.updateUser(person);
	  fillTable();
	  dwr.engine.endBatch();
	}


