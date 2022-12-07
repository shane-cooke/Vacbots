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


public class Decco extends ASTRAClass {
	public Decco() {
		setParents(new Class[] {formulas.class});
		addRule(new Rule(
			"Decco", new int[] {25,9,25,32},
			new GoalEvent('+',
				new Goal(
					new Predicate("main", new Term[] {
						new ListTerm(new Term[] {
							new Variable(Type.STRING, "name",false)
						})
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"Decco", new int[] {25,31,30,5},
				new Statement[] {
					new ModuleCall("ei",
						"Decco", new int[] {27,8,27,58},
						new Predicate("launch", new Term[] {
							Primitive.newPrimitive("vw"),
							Primitive.newPrimitive("dependency/vacuumworld-1.2.0.jar")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("Decco","ei")).launch(
									(java.lang.String) intention.evaluate(predicate.getTerm(0)),
									(java.lang.String) intention.evaluate(predicate.getTerm(1))
								);
							}
						}
					),
					new ModuleCall("ei",
						"Decco", new int[] {28,8,28,17},
						new Predicate("join", new Term[] {}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("Decco","ei")).join(
								);
							}
						}
					),
					new ModuleCall("ei",
						"Decco", new int[] {29,8,29,24},
						new Predicate("link", new Term[] {
							Primitive.newPrimitive("Decco")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("Decco","ei")).link(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					)
				}
			)
		));
		addRule(new Rule(
			"Decco", new int[] {34,9,34,19},
			new GoalEvent('+',
				new Goal(
					new Predicate("init", new Term[] {})
				)
			),
			Predicate.TRUE,
			new Block(
				"Decco", new int[] {34,18,137,5},
				new Statement[] {
					new Wait(
						"Decco", new int[] {35,8,137,5},
						new OR(
							new Predicate("job", new Term[] {
								Primitive.newPrimitive("top")
							}),
							new Predicate("job", new Term[] {
								Primitive.newPrimitive("bottom")
							})
						)
					),
					new Wait(
						"Decco", new int[] {36,8,137,5},
						new OR(
							new Predicate("position", new Term[] {
								Primitive.newPrimitive("top")
							}),
							new Predicate("position", new Term[] {
								Primitive.newPrimitive("bottom")
							})
						)
					),
					new Wait(
						"Decco", new int[] {37,8,137,5},
						new OR(
							new Predicate("harry", new Term[] {
								Primitive.newPrimitive("top")
							}),
							new Predicate("harry", new Term[] {
								Primitive.newPrimitive("bottom")
							})
						)
					),
					new Wait(
						"Decco", new int[] {38,8,137,5},
						new OR(
							new Predicate("henry", new Term[] {
								Primitive.newPrimitive("top")
							}),
							new Predicate("henry", new Term[] {
								Primitive.newPrimitive("bottom")
							})
						)
					),
					new Wait(
						"Decco", new int[] {39,8,137,5},
						new OR(
							new Predicate("lloyd", new Term[] {
								Primitive.newPrimitive("top")
							}),
							new Predicate("lloyd", new Term[] {
								Primitive.newPrimitive("bottom")
							})
						)
					),
					new While(
						"Decco", new int[] {41,8,137,5},
						new Predicate("job", new Term[] {
							Primitive.newPrimitive("top")
						}),
						new Block(
							"Decco", new int[] {41,26,88,9},
							new Statement[] {
								new If(
									"Decco", new int[] {42,12,88,9},
									new Predicate("position", new Term[] {
										Primitive.newPrimitive("top")
									}),
									new Block(
										"Decco", new int[] {42,32,74,13},
										new Statement[] {
											new ModuleCall("ei",
												"Decco", new int[] {43,16,43,30},
												new Predicate("light", new Term[] {
													Primitive.newPrimitive("on")
												}),
												new DefaultModuleCallAdaptor() {
													public boolean inline() {
														return false;
													}

													public boolean invoke(Intention intention, Predicate predicate) {
														return ((astra.lang.EIS) intention.getModule("Decco","ei")).auto_action(intention,evaluate(intention,predicate));
													}
												}
											),
											new If(
												"Decco", new int[] {44,16,74,13},
												new OR(
													new Predicate("peak", new Term[] {
														Primitive.newPrimitive("obstacle")
													}),
													new Predicate("peak", new Term[] {
														Primitive.newPrimitive("vac")
													})
												),
												new Block(
													"Decco", new int[] {44,51,49,17},
													new Statement[] {
														new Declaration(
															new Variable(Type.STRING, "turn"),
															"Decco", new int[] {45,20,49,17},
															new ModuleTerm("mod", Type.STRING,
																new Predicate("randomTurn", new Term[] {}),
																new ModuleTermAdaptor() {
																	public Object invoke(Intention intention, Predicate predicate) {
																		return ((MyModule) intention.getModule("Decco","mod")).randomTurn(
																		);
																	}
																	public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
																		return ((MyModule) visitor.agent().getModule("Decco","mod")).randomTurn(
																		);
																	}
																}
															)
														),
														new ModuleCall("ei",
															"Decco", new int[] {46,20,46,35},
															new Predicate("move", new Term[] {
																new Variable(Type.STRING, "turn"),
																Primitive.newPrimitive(1)
															}),
															new DefaultModuleCallAdaptor() {
																public boolean inline() {
																	return false;
																}

																public boolean invoke(Intention intention, Predicate predicate) {
																	return ((astra.lang.EIS) intention.getModule("Decco","ei")).auto_action(intention,evaluate(intention,predicate));
																}
															}
														),
														new ModuleCall("mod2",
															"Decco", new int[] {47,20,47,39},
															new Predicate("pauseWait", new Term[] {
																Primitive.newPrimitive(1000)
															}),
															new DefaultModuleCallAdaptor() {
																public boolean inline() {
																	return true;
																}

																public boolean invoke(Intention intention, Predicate predicate) {
																	return ((MyModule2) intention.getModule("Decco","mod2")).pauseWait(
																		(java.lang.Integer) intention.evaluate(predicate.getTerm(0))
																	);
																}
															}
														),
														new ModuleCall("ei",
															"Decco", new int[] {48,20,48,30},
															new Predicate("clean", new Term[] {}),
															new DefaultModuleCallAdaptor() {
																public boolean inline() {
																	return false;
																}

																public boolean invoke(Intention intention, Predicate predicate) {
																	return ((astra.lang.EIS) intention.getModule("Decco","ei")).auto_action(intention,evaluate(intention,predicate));
																}
															}
														)
													}
												),
												new If(
													"Decco", new int[] {49,23,74,13},
													new Predicate("peak", new Term[] {
														Primitive.newPrimitive("empty")
													}),
													new Block(
														"Decco", new int[] {49,40,61,17},
														new Statement[] {
															new Declaration(
																new Variable(Type.STRING, "turn"),
																"Decco", new int[] {50,20,61,17},
																new ModuleTerm("mod", Type.STRING,
																	new Predicate("randomTurn", new Term[] {}),
																	new ModuleTermAdaptor() {
																		public Object invoke(Intention intention, Predicate predicate) {
																			return ((MyModule) intention.getModule("Decco","mod")).randomTurn(
																			);
																		}
																		public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
																			return ((MyModule) visitor.agent().getModule("Decco","mod")).randomTurn(
																			);
																		}
																	}
																)
															),
															new Declaration(
																new Variable(Type.INTEGER, "rand"),
																"Decco", new int[] {51,20,61,17},
																new ModuleTerm("mod3", Type.INTEGER,
																	new Predicate("randomInt", new Term[] {}),
																	new ModuleTermAdaptor() {
																		public Object invoke(Intention intention, Predicate predicate) {
																			return ((MyModule3) intention.getModule("Decco","mod3")).randomInt(
																			);
																		}
																		public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
																			return ((MyModule3) visitor.agent().getModule("Decco","mod3")).randomInt(
																			);
																		}
																	}
																)
															),
															new If(
																"Decco", new int[] {52,20,61,17},
																new Comparison("==",
																	new Variable(Type.INTEGER, "rand"),
																	Primitive.newPrimitive(6)
																),
																new Block(
																	"Decco", new int[] {52,33,56,21},
																	new Statement[] {
																		new ModuleCall("C",
																			"Decco", new int[] {53,24,53,43},
																			new Predicate("println", new Term[] {
																				Primitive.newPrimitive("RANDOM")
																			}),
																			new DefaultModuleCallAdaptor() {
																				public boolean inline() {
																					return true;
																				}

																				public boolean invoke(Intention intention, Predicate predicate) {
																					return ((astra.lang.Console) intention.getModule("Decco","C")).println(
																						(java.lang.String) intention.evaluate(predicate.getTerm(0))
																					);
																				}
																			}
																		),
																		new ModuleCall("ei",
																			"Decco", new int[] {54,24,54,39},
																			new Predicate("move", new Term[] {
																				new Variable(Type.STRING, "turn"),
																				Primitive.newPrimitive(1)
																			}),
																			new DefaultModuleCallAdaptor() {
																				public boolean inline() {
																					return false;
																				}

																				public boolean invoke(Intention intention, Predicate predicate) {
																					return ((astra.lang.EIS) intention.getModule("Decco","ei")).auto_action(intention,evaluate(intention,predicate));
																				}
																			}
																		),
																		new ModuleCall("mod2",
																			"Decco", new int[] {55,24,55,43},
																			new Predicate("pauseWait", new Term[] {
																				Primitive.newPrimitive(1000)
																			}),
																			new DefaultModuleCallAdaptor() {
																				public boolean inline() {
																					return true;
																				}

																				public boolean invoke(Intention intention, Predicate predicate) {
																					return ((MyModule2) intention.getModule("Decco","mod2")).pauseWait(
																						(java.lang.Integer) intention.evaluate(predicate.getTerm(0))
																					);
																				}
																			}
																		)
																	}
																),
																new Block(
																	"Decco", new int[] {56,27,61,17},
																	new Statement[] {
																		new ModuleCall("ei",
																			"Decco", new int[] {57,24,57,44},
																			new Predicate("move", new Term[] {
																				Primitive.newPrimitive("forward"),
																				Primitive.newPrimitive(1)
																			}),
																			new DefaultModuleCallAdaptor() {
																				public boolean inline() {
																					return false;
																				}

																				public boolean invoke(Intention intention, Predicate predicate) {
																					return ((astra.lang.EIS) intention.getModule("Decco","ei")).auto_action(intention,evaluate(intention,predicate));
																				}
																			}
																		),
																		new ModuleCall("mod2",
																			"Decco", new int[] {58,24,58,43},
																			new Predicate("pauseWait", new Term[] {
																				Primitive.newPrimitive(1000)
																			}),
																			new DefaultModuleCallAdaptor() {
																				public boolean inline() {
																					return true;
																				}

																				public boolean invoke(Intention intention, Predicate predicate) {
																					return ((MyModule2) intention.getModule("Decco","mod2")).pauseWait(
																						(java.lang.Integer) intention.evaluate(predicate.getTerm(0))
																					);
																				}
																			}
																		),
																		new ModuleCall("ei",
																			"Decco", new int[] {59,24,59,34},
																			new Predicate("clean", new Term[] {}),
																			new DefaultModuleCallAdaptor() {
																				public boolean inline() {
																					return false;
																				}

																				public boolean invoke(Intention intention, Predicate predicate) {
																					return ((astra.lang.EIS) intention.getModule("Decco","ei")).auto_action(intention,evaluate(intention,predicate));
																				}
																			}
																		)
																	}
																)
															)
														}
													),
													new If(
														"Decco", new int[] {61,23,74,13},
														new Predicate("peak", new Term[] {
															Primitive.newPrimitive("dust")
														}),
														new Block(
															"Decco", new int[] {61,39,73,17},
															new Statement[] {
																new Declaration(
																	new Variable(Type.STRING, "turn"),
																	"Decco", new int[] {62,20,73,17},
																	new ModuleTerm("mod", Type.STRING,
																		new Predicate("randomTurn", new Term[] {}),
																		new ModuleTermAdaptor() {
																			public Object invoke(Intention intention, Predicate predicate) {
																				return ((MyModule) intention.getModule("Decco","mod")).randomTurn(
																				);
																			}
																			public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
																				return ((MyModule) visitor.agent().getModule("Decco","mod")).randomTurn(
																				);
																			}
																		}
																	)
																),
																new Declaration(
																	new Variable(Type.INTEGER, "rand"),
																	"Decco", new int[] {63,20,73,17},
																	new ModuleTerm("mod3", Type.INTEGER,
																		new Predicate("randomInt", new Term[] {}),
																		new ModuleTermAdaptor() {
																			public Object invoke(Intention intention, Predicate predicate) {
																				return ((MyModule3) intention.getModule("Decco","mod3")).randomInt(
																				);
																			}
																			public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
																				return ((MyModule3) visitor.agent().getModule("Decco","mod3")).randomInt(
																				);
																			}
																		}
																	)
																),
																new If(
																	"Decco", new int[] {64,20,73,17},
																	new Comparison("==",
																		new Variable(Type.INTEGER, "rand"),
																		Primitive.newPrimitive(6)
																	),
																	new Block(
																		"Decco", new int[] {64,33,68,21},
																		new Statement[] {
																			new ModuleCall("C",
																				"Decco", new int[] {65,24,65,43},
																				new Predicate("println", new Term[] {
																					Primitive.newPrimitive("RANDOM")
																				}),
																				new DefaultModuleCallAdaptor() {
																					public boolean inline() {
																						return true;
																					}

																					public boolean invoke(Intention intention, Predicate predicate) {
																						return ((astra.lang.Console) intention.getModule("Decco","C")).println(
																							(java.lang.String) intention.evaluate(predicate.getTerm(0))
																						);
																					}
																				}
																			),
																			new ModuleCall("ei",
																				"Decco", new int[] {66,24,66,39},
																				new Predicate("move", new Term[] {
																					new Variable(Type.STRING, "turn"),
																					Primitive.newPrimitive(1)
																				}),
																				new DefaultModuleCallAdaptor() {
																					public boolean inline() {
																						return false;
																					}

																					public boolean invoke(Intention intention, Predicate predicate) {
																						return ((astra.lang.EIS) intention.getModule("Decco","ei")).auto_action(intention,evaluate(intention,predicate));
																					}
																				}
																			),
																			new ModuleCall("mod2",
																				"Decco", new int[] {67,24,67,43},
																				new Predicate("pauseWait", new Term[] {
																					Primitive.newPrimitive(1000)
																				}),
																				new DefaultModuleCallAdaptor() {
																					public boolean inline() {
																						return true;
																					}

																					public boolean invoke(Intention intention, Predicate predicate) {
																						return ((MyModule2) intention.getModule("Decco","mod2")).pauseWait(
																							(java.lang.Integer) intention.evaluate(predicate.getTerm(0))
																						);
																					}
																				}
																			)
																		}
																	),
																	new Block(
																		"Decco", new int[] {68,27,73,17},
																		new Statement[] {
																			new ModuleCall("ei",
																				"Decco", new int[] {69,24,69,44},
																				new Predicate("move", new Term[] {
																					Primitive.newPrimitive("forward"),
																					Primitive.newPrimitive(1)
																				}),
																				new DefaultModuleCallAdaptor() {
																					public boolean inline() {
																						return false;
																					}

																					public boolean invoke(Intention intention, Predicate predicate) {
																						return ((astra.lang.EIS) intention.getModule("Decco","ei")).auto_action(intention,evaluate(intention,predicate));
																					}
																				}
																			),
																			new ModuleCall("mod2",
																				"Decco", new int[] {70,24,70,43},
																				new Predicate("pauseWait", new Term[] {
																					Primitive.newPrimitive(1000)
																				}),
																				new DefaultModuleCallAdaptor() {
																					public boolean inline() {
																						return true;
																					}

																					public boolean invoke(Intention intention, Predicate predicate) {
																						return ((MyModule2) intention.getModule("Decco","mod2")).pauseWait(
																							(java.lang.Integer) intention.evaluate(predicate.getTerm(0))
																						);
																					}
																				}
																			),
																			new ModuleCall("ei",
																				"Decco", new int[] {71,24,71,34},
																				new Predicate("clean", new Term[] {}),
																				new DefaultModuleCallAdaptor() {
																					public boolean inline() {
																						return false;
																					}

																					public boolean invoke(Intention intention, Predicate predicate) {
																						return ((astra.lang.EIS) intention.getModule("Decco","ei")).auto_action(intention,evaluate(intention,predicate));
																					}
																				}
																			)
																		}
																	)
																)
															}
														)
													)
												)
											)
										}
									)
								),
								new If(
									"Decco", new int[] {75,12,88,9},
									new Predicate("position", new Term[] {
										Primitive.newPrimitive("bottom")
									}),
									new Block(
										"Decco", new int[] {75,35,87,13},
										new Statement[] {
											new ModuleCall("ei",
												"Decco", new int[] {76,16,76,31},
												new Predicate("light", new Term[] {
													Primitive.newPrimitive("off")
												}),
												new DefaultModuleCallAdaptor() {
													public boolean inline() {
														return false;
													}

													public boolean invoke(Intention intention, Predicate predicate) {
														return ((astra.lang.EIS) intention.getModule("Decco","ei")).auto_action(intention,evaluate(intention,predicate));
													}
												}
											),
											new If(
												"Decco", new int[] {77,16,87,13},
												new OR(
													new Predicate("peak", new Term[] {
														Primitive.newPrimitive("obstacle")
													}),
													new Predicate("peak", new Term[] {
														Primitive.newPrimitive("vac")
													})
												),
												new Block(
													"Decco", new int[] {77,51,82,17},
													new Statement[] {
														new Declaration(
															new Variable(Type.STRING, "turn"),
															"Decco", new int[] {78,20,82,17},
															new ModuleTerm("mod", Type.STRING,
																new Predicate("randomTurn", new Term[] {}),
																new ModuleTermAdaptor() {
																	public Object invoke(Intention intention, Predicate predicate) {
																		return ((MyModule) intention.getModule("Decco","mod")).randomTurn(
																		);
																	}
																	public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
																		return ((MyModule) visitor.agent().getModule("Decco","mod")).randomTurn(
																		);
																	}
																}
															)
														),
														new ModuleCall("ei",
															"Decco", new int[] {79,20,79,35},
															new Predicate("move", new Term[] {
																new Variable(Type.STRING, "turn"),
																Primitive.newPrimitive(1)
															}),
															new DefaultModuleCallAdaptor() {
																public boolean inline() {
																	return false;
																}

																public boolean invoke(Intention intention, Predicate predicate) {
																	return ((astra.lang.EIS) intention.getModule("Decco","ei")).auto_action(intention,evaluate(intention,predicate));
																}
															}
														),
														new ModuleCall("mod2",
															"Decco", new int[] {80,20,80,39},
															new Predicate("pauseWait", new Term[] {
																Primitive.newPrimitive(1000)
															}),
															new DefaultModuleCallAdaptor() {
																public boolean inline() {
																	return true;
																}

																public boolean invoke(Intention intention, Predicate predicate) {
																	return ((MyModule2) intention.getModule("Decco","mod2")).pauseWait(
																		(java.lang.Integer) intention.evaluate(predicate.getTerm(0))
																	);
																}
															}
														),
														new ModuleCall("ei",
															"Decco", new int[] {81,20,81,30},
															new Predicate("clean", new Term[] {}),
															new DefaultModuleCallAdaptor() {
																public boolean inline() {
																	return false;
																}

																public boolean invoke(Intention intention, Predicate predicate) {
																	return ((astra.lang.EIS) intention.getModule("Decco","ei")).auto_action(intention,evaluate(intention,predicate));
																}
															}
														)
													}
												),
												new Block(
													"Decco", new int[] {82,23,87,13},
													new Statement[] {
														new ModuleCall("ei",
															"Decco", new int[] {83,20,83,38},
															new Predicate("move", new Term[] {
																Primitive.newPrimitive("north"),
																Primitive.newPrimitive(1)
															}),
															new DefaultModuleCallAdaptor() {
																public boolean inline() {
																	return false;
																}

																public boolean invoke(Intention intention, Predicate predicate) {
																	return ((astra.lang.EIS) intention.getModule("Decco","ei")).auto_action(intention,evaluate(intention,predicate));
																}
															}
														),
														new ModuleCall("mod2",
															"Decco", new int[] {84,20,84,39},
															new Predicate("pauseWait", new Term[] {
																Primitive.newPrimitive(1000)
															}),
															new DefaultModuleCallAdaptor() {
																public boolean inline() {
																	return true;
																}

																public boolean invoke(Intention intention, Predicate predicate) {
																	return ((MyModule2) intention.getModule("Decco","mod2")).pauseWait(
																		(java.lang.Integer) intention.evaluate(predicate.getTerm(0))
																	);
																}
															}
														),
														new ModuleCall("ei",
															"Decco", new int[] {85,20,85,30},
															new Predicate("clean", new Term[] {}),
															new DefaultModuleCallAdaptor() {
																public boolean inline() {
																	return false;
																}

																public boolean invoke(Intention intention, Predicate predicate) {
																	return ((astra.lang.EIS) intention.getModule("Decco","ei")).auto_action(intention,evaluate(intention,predicate));
																}
															}
														)
													}
												)
											)
										}
									)
								)
							}
						)
					),
					new While(
						"Decco", new int[] {89,8,137,5},
						new Predicate("job", new Term[] {
							Primitive.newPrimitive("bottom")
						}),
						new Block(
							"Decco", new int[] {89,29,136,9},
							new Statement[] {
								new If(
									"Decco", new int[] {90,12,136,9},
									new Predicate("position", new Term[] {
										Primitive.newPrimitive("bottom")
									}),
									new Block(
										"Decco", new int[] {90,35,122,13},
										new Statement[] {
											new ModuleCall("ei",
												"Decco", new int[] {91,16,91,30},
												new Predicate("light", new Term[] {
													Primitive.newPrimitive("on")
												}),
												new DefaultModuleCallAdaptor() {
													public boolean inline() {
														return false;
													}

													public boolean invoke(Intention intention, Predicate predicate) {
														return ((astra.lang.EIS) intention.getModule("Decco","ei")).auto_action(intention,evaluate(intention,predicate));
													}
												}
											),
											new If(
												"Decco", new int[] {92,16,122,13},
												new OR(
													new Predicate("peak", new Term[] {
														Primitive.newPrimitive("obstacle")
													}),
													new Predicate("peak", new Term[] {
														Primitive.newPrimitive("vac")
													})
												),
												new Block(
													"Decco", new int[] {92,51,97,17},
													new Statement[] {
														new Declaration(
															new Variable(Type.STRING, "turn"),
															"Decco", new int[] {93,20,97,17},
															new ModuleTerm("mod", Type.STRING,
																new Predicate("randomTurn", new Term[] {}),
																new ModuleTermAdaptor() {
																	public Object invoke(Intention intention, Predicate predicate) {
																		return ((MyModule) intention.getModule("Decco","mod")).randomTurn(
																		);
																	}
																	public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
																		return ((MyModule) visitor.agent().getModule("Decco","mod")).randomTurn(
																		);
																	}
																}
															)
														),
														new ModuleCall("ei",
															"Decco", new int[] {94,20,94,35},
															new Predicate("move", new Term[] {
																new Variable(Type.STRING, "turn"),
																Primitive.newPrimitive(1)
															}),
															new DefaultModuleCallAdaptor() {
																public boolean inline() {
																	return false;
																}

																public boolean invoke(Intention intention, Predicate predicate) {
																	return ((astra.lang.EIS) intention.getModule("Decco","ei")).auto_action(intention,evaluate(intention,predicate));
																}
															}
														),
														new ModuleCall("mod2",
															"Decco", new int[] {95,20,95,39},
															new Predicate("pauseWait", new Term[] {
																Primitive.newPrimitive(1000)
															}),
															new DefaultModuleCallAdaptor() {
																public boolean inline() {
																	return true;
																}

																public boolean invoke(Intention intention, Predicate predicate) {
																	return ((MyModule2) intention.getModule("Decco","mod2")).pauseWait(
																		(java.lang.Integer) intention.evaluate(predicate.getTerm(0))
																	);
																}
															}
														),
														new ModuleCall("ei",
															"Decco", new int[] {96,20,96,30},
															new Predicate("clean", new Term[] {}),
															new DefaultModuleCallAdaptor() {
																public boolean inline() {
																	return false;
																}

																public boolean invoke(Intention intention, Predicate predicate) {
																	return ((astra.lang.EIS) intention.getModule("Decco","ei")).auto_action(intention,evaluate(intention,predicate));
																}
															}
														)
													}
												),
												new If(
													"Decco", new int[] {97,23,122,13},
													new Predicate("peak", new Term[] {
														Primitive.newPrimitive("empty")
													}),
													new Block(
														"Decco", new int[] {97,41,109,17},
														new Statement[] {
															new Declaration(
																new Variable(Type.STRING, "turn"),
																"Decco", new int[] {98,20,109,17},
																new ModuleTerm("mod", Type.STRING,
																	new Predicate("randomTurn", new Term[] {}),
																	new ModuleTermAdaptor() {
																		public Object invoke(Intention intention, Predicate predicate) {
																			return ((MyModule) intention.getModule("Decco","mod")).randomTurn(
																			);
																		}
																		public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
																			return ((MyModule) visitor.agent().getModule("Decco","mod")).randomTurn(
																			);
																		}
																	}
																)
															),
															new Declaration(
																new Variable(Type.INTEGER, "rand"),
																"Decco", new int[] {99,20,109,17},
																new ModuleTerm("mod3", Type.INTEGER,
																	new Predicate("randomInt", new Term[] {}),
																	new ModuleTermAdaptor() {
																		public Object invoke(Intention intention, Predicate predicate) {
																			return ((MyModule3) intention.getModule("Decco","mod3")).randomInt(
																			);
																		}
																		public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
																			return ((MyModule3) visitor.agent().getModule("Decco","mod3")).randomInt(
																			);
																		}
																	}
																)
															),
															new If(
																"Decco", new int[] {100,20,109,17},
																new Comparison("==",
																	new Variable(Type.INTEGER, "rand"),
																	Primitive.newPrimitive(6)
																),
																new Block(
																	"Decco", new int[] {100,33,104,21},
																	new Statement[] {
																		new ModuleCall("C",
																			"Decco", new int[] {101,24,101,43},
																			new Predicate("println", new Term[] {
																				Primitive.newPrimitive("RANDOM")
																			}),
																			new DefaultModuleCallAdaptor() {
																				public boolean inline() {
																					return true;
																				}

																				public boolean invoke(Intention intention, Predicate predicate) {
																					return ((astra.lang.Console) intention.getModule("Decco","C")).println(
																						(java.lang.String) intention.evaluate(predicate.getTerm(0))
																					);
																				}
																			}
																		),
																		new ModuleCall("ei",
																			"Decco", new int[] {102,24,102,39},
																			new Predicate("move", new Term[] {
																				new Variable(Type.STRING, "turn"),
																				Primitive.newPrimitive(1)
																			}),
																			new DefaultModuleCallAdaptor() {
																				public boolean inline() {
																					return false;
																				}

																				public boolean invoke(Intention intention, Predicate predicate) {
																					return ((astra.lang.EIS) intention.getModule("Decco","ei")).auto_action(intention,evaluate(intention,predicate));
																				}
																			}
																		),
																		new ModuleCall("mod2",
																			"Decco", new int[] {103,24,103,43},
																			new Predicate("pauseWait", new Term[] {
																				Primitive.newPrimitive(1000)
																			}),
																			new DefaultModuleCallAdaptor() {
																				public boolean inline() {
																					return true;
																				}

																				public boolean invoke(Intention intention, Predicate predicate) {
																					return ((MyModule2) intention.getModule("Decco","mod2")).pauseWait(
																						(java.lang.Integer) intention.evaluate(predicate.getTerm(0))
																					);
																				}
																			}
																		)
																	}
																),
																new If(
																	"Decco", new int[] {104,27,109,17},
																	new Predicate("peak", new Term[] {
																		Primitive.newPrimitive("empty")
																	}),
																	new Block(
																		"Decco", new int[] {104,45,108,21},
																		new Statement[] {
																			new ModuleCall("ei",
																				"Decco", new int[] {105,24,105,44},
																				new Predicate("move", new Term[] {
																					Primitive.newPrimitive("forward"),
																					Primitive.newPrimitive(1)
																				}),
																				new DefaultModuleCallAdaptor() {
																					public boolean inline() {
																						return false;
																					}

																					public boolean invoke(Intention intention, Predicate predicate) {
																						return ((astra.lang.EIS) intention.getModule("Decco","ei")).auto_action(intention,evaluate(intention,predicate));
																					}
																				}
																			),
																			new ModuleCall("mod2",
																				"Decco", new int[] {106,24,106,43},
																				new Predicate("pauseWait", new Term[] {
																					Primitive.newPrimitive(1000)
																				}),
																				new DefaultModuleCallAdaptor() {
																					public boolean inline() {
																						return true;
																					}

																					public boolean invoke(Intention intention, Predicate predicate) {
																						return ((MyModule2) intention.getModule("Decco","mod2")).pauseWait(
																							(java.lang.Integer) intention.evaluate(predicate.getTerm(0))
																						);
																					}
																				}
																			),
																			new ModuleCall("ei",
																				"Decco", new int[] {107,24,107,34},
																				new Predicate("clean", new Term[] {}),
																				new DefaultModuleCallAdaptor() {
																					public boolean inline() {
																						return false;
																					}

																					public boolean invoke(Intention intention, Predicate predicate) {
																						return ((astra.lang.EIS) intention.getModule("Decco","ei")).auto_action(intention,evaluate(intention,predicate));
																					}
																				}
																			)
																		}
																	)
																)
															)
														}
													),
													new If(
														"Decco", new int[] {109,23,122,13},
														new Predicate("peak", new Term[] {
															Primitive.newPrimitive("dust")
														}),
														new Block(
															"Decco", new int[] {109,40,121,17},
															new Statement[] {
																new Declaration(
																	new Variable(Type.STRING, "turn"),
																	"Decco", new int[] {110,20,121,17},
																	new ModuleTerm("mod", Type.STRING,
																		new Predicate("randomTurn", new Term[] {}),
																		new ModuleTermAdaptor() {
																			public Object invoke(Intention intention, Predicate predicate) {
																				return ((MyModule) intention.getModule("Decco","mod")).randomTurn(
																				);
																			}
																			public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
																				return ((MyModule) visitor.agent().getModule("Decco","mod")).randomTurn(
																				);
																			}
																		}
																	)
																),
																new Declaration(
																	new Variable(Type.INTEGER, "rand"),
																	"Decco", new int[] {111,20,121,17},
																	new ModuleTerm("mod3", Type.INTEGER,
																		new Predicate("randomInt", new Term[] {}),
																		new ModuleTermAdaptor() {
																			public Object invoke(Intention intention, Predicate predicate) {
																				return ((MyModule3) intention.getModule("Decco","mod3")).randomInt(
																				);
																			}
																			public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
																				return ((MyModule3) visitor.agent().getModule("Decco","mod3")).randomInt(
																				);
																			}
																		}
																	)
																),
																new If(
																	"Decco", new int[] {112,20,121,17},
																	new Comparison("==",
																		new Variable(Type.INTEGER, "rand"),
																		Primitive.newPrimitive(6)
																	),
																	new Block(
																		"Decco", new int[] {112,33,116,21},
																		new Statement[] {
																			new ModuleCall("C",
																				"Decco", new int[] {113,24,113,43},
																				new Predicate("println", new Term[] {
																					Primitive.newPrimitive("RANDOM")
																				}),
																				new DefaultModuleCallAdaptor() {
																					public boolean inline() {
																						return true;
																					}

																					public boolean invoke(Intention intention, Predicate predicate) {
																						return ((astra.lang.Console) intention.getModule("Decco","C")).println(
																							(java.lang.String) intention.evaluate(predicate.getTerm(0))
																						);
																					}
																				}
																			),
																			new ModuleCall("ei",
																				"Decco", new int[] {114,24,114,39},
																				new Predicate("move", new Term[] {
																					new Variable(Type.STRING, "turn"),
																					Primitive.newPrimitive(1)
																				}),
																				new DefaultModuleCallAdaptor() {
																					public boolean inline() {
																						return false;
																					}

																					public boolean invoke(Intention intention, Predicate predicate) {
																						return ((astra.lang.EIS) intention.getModule("Decco","ei")).auto_action(intention,evaluate(intention,predicate));
																					}
																				}
																			),
																			new ModuleCall("mod2",
																				"Decco", new int[] {115,24,115,43},
																				new Predicate("pauseWait", new Term[] {
																					Primitive.newPrimitive(1000)
																				}),
																				new DefaultModuleCallAdaptor() {
																					public boolean inline() {
																						return true;
																					}

																					public boolean invoke(Intention intention, Predicate predicate) {
																						return ((MyModule2) intention.getModule("Decco","mod2")).pauseWait(
																							(java.lang.Integer) intention.evaluate(predicate.getTerm(0))
																						);
																					}
																				}
																			)
																		}
																	),
																	new If(
																		"Decco", new int[] {116,27,121,17},
																		new Predicate("peak", new Term[] {
																			Primitive.newPrimitive("dust")
																		}),
																		new Block(
																			"Decco", new int[] {116,44,120,21},
																			new Statement[] {
																				new ModuleCall("ei",
																					"Decco", new int[] {117,24,117,44},
																					new Predicate("move", new Term[] {
																						Primitive.newPrimitive("forward"),
																						Primitive.newPrimitive(1)
																					}),
																					new DefaultModuleCallAdaptor() {
																						public boolean inline() {
																							return false;
																						}

																						public boolean invoke(Intention intention, Predicate predicate) {
																							return ((astra.lang.EIS) intention.getModule("Decco","ei")).auto_action(intention,evaluate(intention,predicate));
																						}
																					}
																				),
																				new ModuleCall("mod2",
																					"Decco", new int[] {118,24,118,43},
																					new Predicate("pauseWait", new Term[] {
																						Primitive.newPrimitive(1000)
																					}),
																					new DefaultModuleCallAdaptor() {
																						public boolean inline() {
																							return true;
																						}

																						public boolean invoke(Intention intention, Predicate predicate) {
																							return ((MyModule2) intention.getModule("Decco","mod2")).pauseWait(
																								(java.lang.Integer) intention.evaluate(predicate.getTerm(0))
																							);
																						}
																					}
																				),
																				new ModuleCall("ei",
																					"Decco", new int[] {119,24,119,34},
																					new Predicate("clean", new Term[] {}),
																					new DefaultModuleCallAdaptor() {
																						public boolean inline() {
																							return false;
																						}

																						public boolean invoke(Intention intention, Predicate predicate) {
																							return ((astra.lang.EIS) intention.getModule("Decco","ei")).auto_action(intention,evaluate(intention,predicate));
																						}
																					}
																				)
																			}
																		)
																	)
																)
															}
														)
													)
												)
											)
										}
									)
								),
								new If(
									"Decco", new int[] {123,12,136,9},
									new Predicate("position", new Term[] {
										Primitive.newPrimitive("top")
									}),
									new Block(
										"Decco", new int[] {123,32,135,13},
										new Statement[] {
											new ModuleCall("ei",
												"Decco", new int[] {124,16,124,31},
												new Predicate("light", new Term[] {
													Primitive.newPrimitive("off")
												}),
												new DefaultModuleCallAdaptor() {
													public boolean inline() {
														return false;
													}

													public boolean invoke(Intention intention, Predicate predicate) {
														return ((astra.lang.EIS) intention.getModule("Decco","ei")).auto_action(intention,evaluate(intention,predicate));
													}
												}
											),
											new If(
												"Decco", new int[] {125,16,135,13},
												new OR(
													new Predicate("peak", new Term[] {
														Primitive.newPrimitive("obstacle")
													}),
													new Predicate("peak", new Term[] {
														Primitive.newPrimitive("vac")
													})
												),
												new Block(
													"Decco", new int[] {125,51,130,17},
													new Statement[] {
														new Declaration(
															new Variable(Type.STRING, "turn"),
															"Decco", new int[] {126,20,130,17},
															new ModuleTerm("mod", Type.STRING,
																new Predicate("randomTurn", new Term[] {}),
																new ModuleTermAdaptor() {
																	public Object invoke(Intention intention, Predicate predicate) {
																		return ((MyModule) intention.getModule("Decco","mod")).randomTurn(
																		);
																	}
																	public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
																		return ((MyModule) visitor.agent().getModule("Decco","mod")).randomTurn(
																		);
																	}
																}
															)
														),
														new ModuleCall("ei",
															"Decco", new int[] {127,20,127,35},
															new Predicate("move", new Term[] {
																new Variable(Type.STRING, "turn"),
																Primitive.newPrimitive(1)
															}),
															new DefaultModuleCallAdaptor() {
																public boolean inline() {
																	return false;
																}

																public boolean invoke(Intention intention, Predicate predicate) {
																	return ((astra.lang.EIS) intention.getModule("Decco","ei")).auto_action(intention,evaluate(intention,predicate));
																}
															}
														),
														new ModuleCall("mod2",
															"Decco", new int[] {128,20,128,39},
															new Predicate("pauseWait", new Term[] {
																Primitive.newPrimitive(1000)
															}),
															new DefaultModuleCallAdaptor() {
																public boolean inline() {
																	return true;
																}

																public boolean invoke(Intention intention, Predicate predicate) {
																	return ((MyModule2) intention.getModule("Decco","mod2")).pauseWait(
																		(java.lang.Integer) intention.evaluate(predicate.getTerm(0))
																	);
																}
															}
														),
														new ModuleCall("ei",
															"Decco", new int[] {129,20,129,30},
															new Predicate("clean", new Term[] {}),
															new DefaultModuleCallAdaptor() {
																public boolean inline() {
																	return false;
																}

																public boolean invoke(Intention intention, Predicate predicate) {
																	return ((astra.lang.EIS) intention.getModule("Decco","ei")).auto_action(intention,evaluate(intention,predicate));
																}
															}
														)
													}
												),
												new Block(
													"Decco", new int[] {130,23,135,13},
													new Statement[] {
														new ModuleCall("ei",
															"Decco", new int[] {131,20,131,38},
															new Predicate("move", new Term[] {
																Primitive.newPrimitive("south"),
																Primitive.newPrimitive(1)
															}),
															new DefaultModuleCallAdaptor() {
																public boolean inline() {
																	return false;
																}

																public boolean invoke(Intention intention, Predicate predicate) {
																	return ((astra.lang.EIS) intention.getModule("Decco","ei")).auto_action(intention,evaluate(intention,predicate));
																}
															}
														),
														new ModuleCall("mod2",
															"Decco", new int[] {132,20,132,39},
															new Predicate("pauseWait", new Term[] {
																Primitive.newPrimitive(1000)
															}),
															new DefaultModuleCallAdaptor() {
																public boolean inline() {
																	return true;
																}

																public boolean invoke(Intention intention, Predicate predicate) {
																	return ((MyModule2) intention.getModule("Decco","mod2")).pauseWait(
																		(java.lang.Integer) intention.evaluate(predicate.getTerm(0))
																	);
																}
															}
														),
														new ModuleCall("ei",
															"Decco", new int[] {133,20,133,30},
															new Predicate("clean", new Term[] {}),
															new DefaultModuleCallAdaptor() {
																public boolean inline() {
																	return false;
																}

																public boolean invoke(Intention intention, Predicate predicate) {
																	return ((astra.lang.EIS) intention.getModule("Decco","ei")).auto_action(intention,evaluate(intention,predicate));
																}
															}
														)
													}
												)
											)
										}
									)
								)
							}
						)
					)
				}
			)
		));
		addRule(new Rule(
			"Decco", new int[] {139,9,139,45},
			new ModuleEvent("ei",
				"$eis",
				new Predicate("event", new Term[] {
					new Funct("location", new Term[] {
						new Variable(Type.INTEGER, "x",false),
						new Variable(Type.INTEGER, "y",false)
					})
				}),
				new ModuleEventAdaptor() {
					public Event generate(astra.core.Agent agent, Predicate predicate) {
						return ((astra.lang.EIS) agent.getModule("Decco","ei")).event(
							"+",
							predicate.getTerm(0)
						);
					}
				}
			),
			Predicate.TRUE,
			new Block(
				"Decco", new int[] {139,44,145,5},
				new Statement[] {
					new If(
						"Decco", new int[] {140,8,145,5},
						new Comparison("<=",
							new Variable(Type.INTEGER, "y"),
							Primitive.newPrimitive(3)
						),
						new Block(
							"Decco", new int[] {140,18,142,9},
							new Statement[] {
								new Send("Decco", new int[] {141,12,141,46},
									new Performative("inform"),
									Primitive.newPrimitive("Decco"),
									new Predicate("area", new Term[] {
										Primitive.newPrimitive("top")
									})
								)
							}
						),
						new If(
							"Decco", new int[] {142,15,145,5},
							new Comparison(">=",
								new Variable(Type.INTEGER, "y"),
								Primitive.newPrimitive(4)
							),
							new Block(
								"Decco", new int[] {142,25,144,9},
								new Statement[] {
									new Send("Decco", new int[] {143,12,143,49},
										new Performative("inform"),
										Primitive.newPrimitive("Decco"),
										new Predicate("area", new Term[] {
											Primitive.newPrimitive("bottom")
										})
									)
								}
							)
						)
					)
				}
			)
		));
		addRule(new Rule(
			"Decco", new int[] {147,9,147,58},
			new MessageEvent(
				new Performative("inform"),
				new Variable(Type.STRING, "sender",false),
				new Predicate("area", new Term[] {
					new Variable(Type.STRING, "X",false)
				})
			),
			Predicate.TRUE,
			new Block(
				"Decco", new int[] {147,57,222,5},
				new Statement[] {
					new If(
						"Decco", new int[] {149,8,222,5},
						new Comparison("==",
							new Variable(Type.STRING, "sender"),
							Primitive.newPrimitive("Decco")
						),
						new Block(
							"Decco", new int[] {149,30,153,9},
							new Statement[] {
								new ModuleCall("C",
									"Decco", new int[] {150,12,150,79},
									new Predicate("println", new Term[] {
										Operator.newOperator('+',
											new Variable(Type.STRING, "sender"),
											Operator.newOperator('+',
												Primitive.newPrimitive(" will work in the "),
												Operator.newOperator('+',
													new Variable(Type.STRING, "X"),
													Primitive.newPrimitive(" half of the grid.")
												)
											)
										)
									}),
									new DefaultModuleCallAdaptor() {
										public boolean inline() {
											return true;
										}

										public boolean invoke(Intention intention, Predicate predicate) {
											return ((astra.lang.Console) intention.getModule("Decco","C")).println(
												(java.lang.String) intention.evaluate(predicate.getTerm(0))
											);
										}
									}
								),
								new BeliefUpdate('+',
									"Decco", new int[] {151,12,153,9},
									new Predicate("decco", new Term[] {
										new Variable(Type.STRING, "X")
									})
								),
								new BeliefUpdate('+',
									"Decco", new int[] {152,12,153,9},
									new Predicate("job", new Term[] {
										new Variable(Type.STRING, "X")
									})
								)
							}
						)
					),
					new Wait(
						"Decco", new int[] {154,8,222,5},
						new OR(
							new Predicate("job", new Term[] {
								Primitive.newPrimitive("top")
							}),
							new Predicate("job", new Term[] {
								Primitive.newPrimitive("bottom")
							})
						)
					),
					new If(
						"Decco", new int[] {155,8,222,5},
						new Comparison("==",
							new Variable(Type.STRING, "sender"),
							Primitive.newPrimitive("Harry")
						),
						new Block(
							"Decco", new int[] {155,30,177,9},
							new Statement[] {
								new If(
									"Decco", new int[] {156,12,177,9},
									new Comparison("==",
										new Variable(Type.STRING, "X"),
										Primitive.newPrimitive("top")
									),
									new Block(
										"Decco", new int[] {156,27,166,13},
										new Statement[] {
											new If(
												"Decco", new int[] {157,16,166,13},
												new Predicate("decco", new Term[] {
													Primitive.newPrimitive("top")
												}),
												new Block(
													"Decco", new int[] {157,33,161,17},
													new Statement[] {
														new BeliefUpdate('-',
															"Decco", new int[] {158,20,161,17},
															new Predicate("harry", new Term[] {
																Primitive.newPrimitive("none")
															})
														),
														new BeliefUpdate('+',
															"Decco", new int[] {159,20,161,17},
															new Predicate("harry", new Term[] {
																Primitive.newPrimitive("bottom")
															})
														),
														new Send("Decco", new int[] {160,20,160,64},
															new Performative("inform"),
															Primitive.newPrimitive("Harry"),
															new Predicate("instruction", new Term[] {
																Primitive.newPrimitive("bottom")
															})
														)
													}
												),
												new If(
													"Decco", new int[] {161,23,166,13},
													new Predicate("decco", new Term[] {
														Primitive.newPrimitive("bottom")
													}),
													new Block(
														"Decco", new int[] {161,43,165,17},
														new Statement[] {
															new BeliefUpdate('-',
																"Decco", new int[] {162,20,165,17},
																new Predicate("harry", new Term[] {
																	Primitive.newPrimitive("none")
																})
															),
															new BeliefUpdate('+',
																"Decco", new int[] {163,20,165,17},
																new Predicate("harry", new Term[] {
																	Primitive.newPrimitive("top")
																})
															),
															new Send("Decco", new int[] {164,20,164,61},
																new Performative("inform"),
																Primitive.newPrimitive("Harry"),
																new Predicate("instruction", new Term[] {
																	Primitive.newPrimitive("top")
																})
															)
														}
													)
												)
											)
										}
									),
									new If(
										"Decco", new int[] {166,19,177,9},
										new Comparison("==",
											new Variable(Type.STRING, "X"),
											Primitive.newPrimitive("bottom")
										),
										new Block(
											"Decco", new int[] {166,37,176,13},
											new Statement[] {
												new If(
													"Decco", new int[] {167,16,176,13},
													new Predicate("decco", new Term[] {
														Primitive.newPrimitive("bottom")
													}),
													new Block(
														"Decco", new int[] {167,36,171,17},
														new Statement[] {
															new BeliefUpdate('-',
																"Decco", new int[] {168,20,171,17},
																new Predicate("harry", new Term[] {
																	Primitive.newPrimitive("none")
																})
															),
															new BeliefUpdate('+',
																"Decco", new int[] {169,20,171,17},
																new Predicate("harry", new Term[] {
																	Primitive.newPrimitive("top")
																})
															),
															new Send("Decco", new int[] {170,20,170,61},
																new Performative("inform"),
																Primitive.newPrimitive("Harry"),
																new Predicate("instruction", new Term[] {
																	Primitive.newPrimitive("top")
																})
															)
														}
													),
													new If(
														"Decco", new int[] {171,23,176,13},
														new Predicate("decco", new Term[] {
															Primitive.newPrimitive("top")
														}),
														new Block(
															"Decco", new int[] {171,40,175,17},
															new Statement[] {
																new BeliefUpdate('-',
																	"Decco", new int[] {172,20,175,17},
																	new Predicate("harry", new Term[] {
																		Primitive.newPrimitive("none")
																	})
																),
																new BeliefUpdate('+',
																	"Decco", new int[] {173,20,175,17},
																	new Predicate("harry", new Term[] {
																		Primitive.newPrimitive("bottom")
																	})
																),
																new Send("Decco", new int[] {174,20,174,64},
																	new Performative("inform"),
																	Primitive.newPrimitive("Harry"),
																	new Predicate("instruction", new Term[] {
																		Primitive.newPrimitive("bottom")
																	})
																)
															}
														)
													)
												)
											}
										)
									)
								)
							}
						),
						new If(
							"Decco", new int[] {177,15,222,5},
							new Comparison("==",
								new Variable(Type.STRING, "sender"),
								Primitive.newPrimitive("Henry")
							),
							new Block(
								"Decco", new int[] {177,37,199,9},
								new Statement[] {
									new If(
										"Decco", new int[] {178,12,199,9},
										new Comparison("==",
											new Variable(Type.STRING, "X"),
											Primitive.newPrimitive("top")
										),
										new Block(
											"Decco", new int[] {178,27,188,13},
											new Statement[] {
												new If(
													"Decco", new int[] {179,16,188,13},
													new Predicate("lloyd", new Term[] {
														Primitive.newPrimitive("top")
													}),
													new Block(
														"Decco", new int[] {179,33,183,17},
														new Statement[] {
															new BeliefUpdate('-',
																"Decco", new int[] {180,20,183,17},
																new Predicate("henry", new Term[] {
																	Primitive.newPrimitive("none")
																})
															),
															new BeliefUpdate('+',
																"Decco", new int[] {181,20,183,17},
																new Predicate("henry", new Term[] {
																	Primitive.newPrimitive("bottom")
																})
															),
															new Send("Decco", new int[] {182,20,182,64},
																new Performative("inform"),
																Primitive.newPrimitive("Henry"),
																new Predicate("instruction", new Term[] {
																	Primitive.newPrimitive("bottom")
																})
															)
														}
													),
													new If(
														"Decco", new int[] {183,23,188,13},
														new Predicate("lloyd", new Term[] {
															Primitive.newPrimitive("bottom")
														}),
														new Block(
															"Decco", new int[] {183,43,187,17},
															new Statement[] {
																new BeliefUpdate('-',
																	"Decco", new int[] {184,20,187,17},
																	new Predicate("henry", new Term[] {
																		Primitive.newPrimitive("none")
																	})
																),
																new BeliefUpdate('+',
																	"Decco", new int[] {185,20,187,17},
																	new Predicate("henry", new Term[] {
																		Primitive.newPrimitive("top")
																	})
																),
																new Send("Decco", new int[] {186,20,186,61},
																	new Performative("inform"),
																	Primitive.newPrimitive("Henry"),
																	new Predicate("instruction", new Term[] {
																		Primitive.newPrimitive("top")
																	})
																)
															}
														)
													)
												)
											}
										),
										new If(
											"Decco", new int[] {188,19,199,9},
											new Comparison("==",
												new Variable(Type.STRING, "X"),
												Primitive.newPrimitive("bottom")
											),
											new Block(
												"Decco", new int[] {188,37,198,13},
												new Statement[] {
													new If(
														"Decco", new int[] {189,16,198,13},
														new Predicate("lloyd", new Term[] {
															Primitive.newPrimitive("bottom")
														}),
														new Block(
															"Decco", new int[] {189,36,193,17},
															new Statement[] {
																new BeliefUpdate('-',
																	"Decco", new int[] {190,20,193,17},
																	new Predicate("henry", new Term[] {
																		Primitive.newPrimitive("none")
																	})
																),
																new BeliefUpdate('+',
																	"Decco", new int[] {191,20,193,17},
																	new Predicate("henry", new Term[] {
																		Primitive.newPrimitive("top")
																	})
																),
																new Send("Decco", new int[] {192,20,192,61},
																	new Performative("inform"),
																	Primitive.newPrimitive("Henry"),
																	new Predicate("instruction", new Term[] {
																		Primitive.newPrimitive("top")
																	})
																)
															}
														),
														new If(
															"Decco", new int[] {193,23,198,13},
															new Predicate("lloyd", new Term[] {
																Primitive.newPrimitive("top")
															}),
															new Block(
																"Decco", new int[] {193,40,197,17},
																new Statement[] {
																	new BeliefUpdate('-',
																		"Decco", new int[] {194,20,197,17},
																		new Predicate("henry", new Term[] {
																			Primitive.newPrimitive("none")
																		})
																	),
																	new BeliefUpdate('+',
																		"Decco", new int[] {195,20,197,17},
																		new Predicate("henry", new Term[] {
																			Primitive.newPrimitive("bottom")
																		})
																	),
																	new Send("Decco", new int[] {196,20,196,64},
																		new Performative("inform"),
																		Primitive.newPrimitive("Henry"),
																		new Predicate("instruction", new Term[] {
																			Primitive.newPrimitive("bottom")
																		})
																	)
																}
															)
														)
													)
												}
											)
										)
									)
								}
							),
							new If(
								"Decco", new int[] {199,15,222,5},
								new Comparison("==",
									new Variable(Type.STRING, "sender"),
									Primitive.newPrimitive("Lloyd")
								),
								new Block(
									"Decco", new int[] {199,37,221,9},
									new Statement[] {
										new If(
											"Decco", new int[] {200,12,221,9},
											new Comparison("==",
												new Variable(Type.STRING, "X"),
												Primitive.newPrimitive("top")
											),
											new Block(
												"Decco", new int[] {200,27,210,13},
												new Statement[] {
													new If(
														"Decco", new int[] {201,16,210,13},
														new Predicate("henry", new Term[] {
															Primitive.newPrimitive("top")
														}),
														new Block(
															"Decco", new int[] {201,33,205,17},
															new Statement[] {
																new BeliefUpdate('-',
																	"Decco", new int[] {202,20,205,17},
																	new Predicate("lloyd", new Term[] {
																		Primitive.newPrimitive("none")
																	})
																),
																new BeliefUpdate('+',
																	"Decco", new int[] {203,20,205,17},
																	new Predicate("lloyd", new Term[] {
																		Primitive.newPrimitive("bottom")
																	})
																),
																new Send("Decco", new int[] {204,20,204,64},
																	new Performative("inform"),
																	Primitive.newPrimitive("Lloyd"),
																	new Predicate("instruction", new Term[] {
																		Primitive.newPrimitive("bottom")
																	})
																)
															}
														),
														new Block(
															"Decco", new int[] {205,23,210,13},
															new Statement[] {
																new BeliefUpdate('-',
																	"Decco", new int[] {206,20,209,17},
																	new Predicate("lloyd", new Term[] {
																		Primitive.newPrimitive("none")
																	})
																),
																new BeliefUpdate('+',
																	"Decco", new int[] {207,20,209,17},
																	new Predicate("lloyd", new Term[] {
																		Primitive.newPrimitive("top")
																	})
																),
																new Send("Decco", new int[] {208,20,208,61},
																	new Performative("inform"),
																	Primitive.newPrimitive("Lloyd"),
																	new Predicate("instruction", new Term[] {
																		Primitive.newPrimitive("top")
																	})
																)
															}
														)
													)
												}
											),
											new If(
												"Decco", new int[] {210,19,221,9},
												new Comparison("==",
													new Variable(Type.STRING, "X"),
													Primitive.newPrimitive("bottom")
												),
												new Block(
													"Decco", new int[] {210,37,220,13},
													new Statement[] {
														new If(
															"Decco", new int[] {211,16,220,13},
															new Predicate("henry", new Term[] {
																Primitive.newPrimitive("bottom")
															}),
															new Block(
																"Decco", new int[] {211,36,215,17},
																new Statement[] {
																	new BeliefUpdate('-',
																		"Decco", new int[] {212,20,215,17},
																		new Predicate("lloyd", new Term[] {
																			Primitive.newPrimitive("none")
																		})
																	),
																	new BeliefUpdate('+',
																		"Decco", new int[] {213,20,215,17},
																		new Predicate("lloyd", new Term[] {
																			Primitive.newPrimitive("top")
																		})
																	),
																	new Send("Decco", new int[] {214,20,214,61},
																		new Performative("inform"),
																		Primitive.newPrimitive("Lloyd"),
																		new Predicate("instruction", new Term[] {
																			Primitive.newPrimitive("top")
																		})
																	)
																}
															),
															new Block(
																"Decco", new int[] {215,23,220,13},
																new Statement[] {
																	new BeliefUpdate('-',
																		"Decco", new int[] {216,20,219,17},
																		new Predicate("lloyd", new Term[] {
																			Primitive.newPrimitive("none")
																		})
																	),
																	new BeliefUpdate('+',
																		"Decco", new int[] {217,20,219,17},
																		new Predicate("lloyd", new Term[] {
																			Primitive.newPrimitive("bottom")
																		})
																	),
																	new Send("Decco", new int[] {218,20,218,64},
																		new Performative("inform"),
																		Primitive.newPrimitive("Lloyd"),
																		new Predicate("instruction", new Term[] {
																			Primitive.newPrimitive("bottom")
																		})
																	)
																}
															)
														)
													}
												)
											)
										)
									}
								)
							)
						)
					)
				}
			)
		));
		addRule(new Rule(
			"Decco", new int[] {224,9,224,84},
			new ModuleEvent("ei",
				"$eis",
				new Predicate("event", new Term[] {
					new Funct("square", new Term[] {
						Primitive.newPrimitive("forward"),
						new Variable(Type.STRING, "content",false)
					})
				}),
				new ModuleEventAdaptor() {
					public Event generate(astra.core.Agent agent, Predicate predicate) {
						return ((astra.lang.EIS) agent.getModule("Decco","ei")).event(
							"+",
							predicate.getTerm(0)
						);
					}
				}
			),
			new ModuleFormula("ei",
				new Predicate("location", new Term[] {
					new Variable(Type.INTEGER, "s",false),
					new Variable(Type.INTEGER, "d",false)
				}),
				new ModuleFormulaAdaptor() {
					public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
						return ((astra.lang.EIS) visitor.agent().getModule("Decco","ei")).auto_formula((Predicate) predicate.accept(visitor));
					}
				}
			),
			new Block(
				"Decco", new int[] {224,83,235,5},
				new Statement[] {
					new SpecialBeliefUpdate(
						"Decco", new int[] {225,8,235,5},
						new Predicate("peak", new Term[] {
							new Variable(Type.STRING, "content")
						})
					),
					new If(
						"Decco", new int[] {227,8,235,5},
						new Comparison("<=",
							new Variable(Type.INTEGER, "d"),
							Primitive.newPrimitive(3)
						),
						new Block(
							"Decco", new int[] {227,18,230,9},
							new Statement[] {
								new SpecialBeliefUpdate(
									"Decco", new int[] {228,12,230,9},
									new Predicate("position", new Term[] {
										Primitive.newPrimitive("top")
									})
								),
								new ModuleCall("C",
									"Decco", new int[] {229,12,229,29},
									new Predicate("println", new Term[] {
										Primitive.newPrimitive("PTOP")
									}),
									new DefaultModuleCallAdaptor() {
										public boolean inline() {
											return true;
										}

										public boolean invoke(Intention intention, Predicate predicate) {
											return ((astra.lang.Console) intention.getModule("Decco","C")).println(
												(java.lang.String) intention.evaluate(predicate.getTerm(0))
											);
										}
									}
								)
							}
						)
					),
					new If(
						"Decco", new int[] {231,8,235,5},
						new Comparison(">=",
							new Variable(Type.INTEGER, "d"),
							Primitive.newPrimitive(4)
						),
						new Block(
							"Decco", new int[] {231,18,234,9},
							new Statement[] {
								new SpecialBeliefUpdate(
									"Decco", new int[] {232,12,234,9},
									new Predicate("position", new Term[] {
										Primitive.newPrimitive("bottom")
									})
								),
								new ModuleCall("C",
									"Decco", new int[] {233,12,233,29},
									new Predicate("println", new Term[] {
										Primitive.newPrimitive("PBOT")
									}),
									new DefaultModuleCallAdaptor() {
										public boolean inline() {
											return true;
										}

										public boolean invoke(Intention intention, Predicate predicate) {
											return ((astra.lang.Console) intention.getModule("Decco","C")).println(
												(java.lang.String) intention.evaluate(predicate.getTerm(0))
											);
										}
									}
								)
							}
						)
					)
				}
			)
		));
	}

	public void initialize(astra.core.Agent agent) {
		agent.addSensorAdaptor(new SensorAdaptor() {
			public void sense(astra.core.Agent agent) {
				((astra.lang.EIS) agent.getModule("Decco","ei")).sense();
			}
		});

		agent.initialize(
			new Predicate("decco", new Term[] {
				Primitive.newPrimitive("none")
			})
		);
		agent.initialize(
			new Predicate("harry", new Term[] {
				Primitive.newPrimitive("none")
			})
		);
		agent.initialize(
			new Predicate("henry", new Term[] {
				Primitive.newPrimitive("none")
			})
		);
		agent.initialize(
			new Predicate("lloyd", new Term[] {
				Primitive.newPrimitive("none")
			})
		);
		agent.initialize(
			new Goal(
				new Predicate("init", new Term[] {})
			)
		);
	}

	public Fragment createFragment(astra.core.Agent agent) throws ASTRAClassNotFoundException {
		Fragment fragment = new Fragment(this);
		fragment.addModule("C",astra.lang.Console.class,agent);
		fragment.addModule("S",astra.lang.System.class,agent);
		fragment.addModule("ei",astra.lang.EIS.class,agent);
		fragment.addModule("mod",MyModule.class,agent);
		fragment.addModule("mod2",MyModule2.class,agent);
		fragment.addModule("mod3",MyModule3.class,agent);
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
			astra.core.Agent agent = new Decco().newInstance(name);
			agent.initialize(new Goal(new Predicate("main", new Term[] { argList })));
			Scheduler.schedule(agent);
		} catch (AgentCreationException e) {
			e.printStackTrace();
		} catch (ASTRAClassNotFoundException e) {
			e.printStackTrace();
		};
	}
}
