/**
 * GENERATED CODE - DO NOT CHANGE
 */

import astra.core.*;
import astra.execution.*;
import astra.event.*;
import astra.messaging.*;
import astra.formula.*;
import astra.lang.*;
import astra.statement.*;
import astra.term.*;
import astra.type.*;
import astra.tr.*;
import astra.reasoner.util.*;


public class Main extends ASTRAClass {
	public Main() {
		setParents(new Class[] {astra.lang.Agent.class});
		addRule(new Rule(
			"Main", new int[] {8,9,8,28},
			new GoalEvent('+',
				new Goal(
					new Predicate("main", new Term[] {
						new Variable(Type.LIST, "args",false)
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"Main", new int[] {8,27,27,5},
				new Statement[] {
					new ModuleCall("ei",
						"Main", new int[] {9,8,9,58},
						new Predicate("launch", new Term[] {
							Primitive.newPrimitive("vw"),
							Primitive.newPrimitive("dependency/vacuumworld-1.2.0.jar")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("Main","ei")).launch(
									(java.lang.String) intention.evaluate(predicate.getTerm(0)),
									(java.lang.String) intention.evaluate(predicate.getTerm(1))
								);
							}
						}
					),
					new ModuleCall("ei",
						"Main", new int[] {10,8,10,35},
						new Predicate("init", new Term[] {
							new ListTerm(new Term[] {
								new Funct("generation", new Term[] {
									Primitive.newPrimitive("no")
								})
							})
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("Main","ei")).init(
									(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new ModuleCall("ei",
						"Main", new int[] {11,8,11,17},
						new Predicate("join", new Term[] {}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("Main","ei")).join(
								);
							}
						}
					),
					new ModuleCall("ei",
						"Main", new int[] {12,8,12,21},
						new Predicate("startEnv", new Term[] {}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("Main","ei")).startEnv(
								);
							}
						}
					),
					new Declaration(
						new Variable(Type.LIST, "E"),
						"Main", new int[] {14,8,27,5},
						new ModuleTerm("ei", Type.LIST,
							new Predicate("freeEntities", new Term[] {}),
							new ModuleTermAdaptor() {
								public Object invoke(Intention intention, Predicate predicate) {
									return ((astra.lang.EIS) intention.getModule("Main","ei")).freeEntities(
									);
								}
								public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
									return ((astra.lang.EIS) visitor.agent().getModule("Main","ei")).freeEntities(
									);
								}
							}
						)
					),
					new ForAll(
						"Main", new int[] {15,8,15,30},
						new Variable(Type.STRING, "ent",false),
						new Variable(Type.LIST, "E"),
						new Block(
							"Main", new int[] {15,31,27,5},
							new Statement[] {
								new ModuleCall("C",
									"Main", new int[] {16,12,16,29},
									new Predicate("println", new Term[] {
										Operator.newOperator('+',
											Primitive.newPrimitive("E="),
											new Variable(Type.LIST, "E")
										)
									}),
									new DefaultModuleCallAdaptor() {
										public boolean inline() {
											return true;
										}

										public boolean invoke(Intention intention, Predicate predicate) {
											return ((astra.lang.Console) intention.getModule("Main","C")).println(
												(java.lang.String) intention.evaluate(predicate.getTerm(0))
											);
										}
									}
								)
							}
						)
					),
					new ModuleCall("S",
						"Main", new int[] {19,8,19,39},
						new Predicate("createAgent", new Term[] {
							Primitive.newPrimitive("Decco"),
							Primitive.newPrimitive("Decco")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.System) intention.getModule("Main","S")).createAgent(
									(java.lang.String) intention.evaluate(predicate.getTerm(0)),
									(java.lang.String) intention.evaluate(predicate.getTerm(1))
								);
							}
						}
					),
					new ModuleCall("S",
						"Main", new int[] {20,8,20,41},
						new Predicate("setMainGoal", new Term[] {
							Primitive.newPrimitive("Decco"),
							new ListTerm(new Term[] {
								Primitive.newPrimitive("Decco")
							})
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.System) intention.getModule("Main","S")).setMainGoal(
									(java.lang.String) intention.evaluate(predicate.getTerm(0)),
									(astra.term.ListTerm) intention.evaluate(predicate.getTerm(1))
								);
							}
						}
					),
					new ModuleCall("S",
						"Main", new int[] {21,8,21,39},
						new Predicate("createAgent", new Term[] {
							Primitive.newPrimitive("Lloyd"),
							Primitive.newPrimitive("Lloyd")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.System) intention.getModule("Main","S")).createAgent(
									(java.lang.String) intention.evaluate(predicate.getTerm(0)),
									(java.lang.String) intention.evaluate(predicate.getTerm(1))
								);
							}
						}
					),
					new ModuleCall("S",
						"Main", new int[] {22,8,22,41},
						new Predicate("setMainGoal", new Term[] {
							Primitive.newPrimitive("Lloyd"),
							new ListTerm(new Term[] {
								Primitive.newPrimitive("Lloyd")
							})
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.System) intention.getModule("Main","S")).setMainGoal(
									(java.lang.String) intention.evaluate(predicate.getTerm(0)),
									(astra.term.ListTerm) intention.evaluate(predicate.getTerm(1))
								);
							}
						}
					),
					new ModuleCall("S",
						"Main", new int[] {23,8,23,39},
						new Predicate("createAgent", new Term[] {
							Primitive.newPrimitive("Harry"),
							Primitive.newPrimitive("Harry")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.System) intention.getModule("Main","S")).createAgent(
									(java.lang.String) intention.evaluate(predicate.getTerm(0)),
									(java.lang.String) intention.evaluate(predicate.getTerm(1))
								);
							}
						}
					),
					new ModuleCall("S",
						"Main", new int[] {24,8,24,41},
						new Predicate("setMainGoal", new Term[] {
							Primitive.newPrimitive("Harry"),
							new ListTerm(new Term[] {
								Primitive.newPrimitive("Harry")
							})
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.System) intention.getModule("Main","S")).setMainGoal(
									(java.lang.String) intention.evaluate(predicate.getTerm(0)),
									(astra.term.ListTerm) intention.evaluate(predicate.getTerm(1))
								);
							}
						}
					),
					new ModuleCall("S",
						"Main", new int[] {25,8,25,39},
						new Predicate("createAgent", new Term[] {
							Primitive.newPrimitive("Henry"),
							Primitive.newPrimitive("Henry")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.System) intention.getModule("Main","S")).createAgent(
									(java.lang.String) intention.evaluate(predicate.getTerm(0)),
									(java.lang.String) intention.evaluate(predicate.getTerm(1))
								);
							}
						}
					),
					new ModuleCall("S",
						"Main", new int[] {26,8,26,41},
						new Predicate("setMainGoal", new Term[] {
							Primitive.newPrimitive("Henry"),
							new ListTerm(new Term[] {
								Primitive.newPrimitive("Henry")
							})
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.System) intention.getModule("Main","S")).setMainGoal(
									(java.lang.String) intention.evaluate(predicate.getTerm(0)),
									(astra.term.ListTerm) intention.evaluate(predicate.getTerm(1))
								);
							}
						}
					)
				}
			)
		));
	}

	public void initialize(astra.core.Agent agent) {
		agent.addSensorAdaptor(new SensorAdaptor() {
			public void sense(astra.core.Agent agent) {
				((astra.lang.EIS) agent.getModule("Main","ei")).sense();
			}
		});

	}

	public Fragment createFragment(astra.core.Agent agent) throws ASTRAClassNotFoundException {
		Fragment fragment = new Fragment(this);
		fragment.addModule("C",astra.lang.Console.class,agent);
		fragment.addModule("S",astra.lang.System.class,agent);
		fragment.addModule("ei",astra.lang.EIS.class,agent);
		fragment.addModule("debug",astra.lang.Debug.class,agent);
		fragment.addModule("mod",MyModule.class,agent);
		return fragment;
	}

	public static void main(String[] args) {
		Scheduler.setStrategy(new TestSchedulerStrategy());
		ListTerm argList = new ListTerm();
		for (String arg: args) {
			argList.add(Primitive.newPrimitive(arg));
		}

		String name = java.lang.System.getProperty("astra.name", "main");
		try {
			astra.core.Agent agent = new Main().newInstance(name);
			agent.initialize(new Goal(new Predicate("main", new Term[] { argList })));
			Scheduler.schedule(agent);
		} catch (AgentCreationException e) {
			e.printStackTrace();
		} catch (ASTRAClassNotFoundException e) {
			e.printStackTrace();
		};
	}
}
