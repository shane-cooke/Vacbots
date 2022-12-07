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


public class Lloyd extends ASTRAClass {
	public Lloyd() {
		setParents(new Class[] {formulas.class});
		addRule(new Rule(
			"Lloyd", new int[] {16,9,16,32},
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
				"Lloyd", new int[] {16,31,21,5},
				new Statement[] {
					new ModuleCall("ei",
						"Lloyd", new int[] {18,8,18,58},
						new Predicate("launch", new Term[] {
							Primitive.newPrimitive("vw"),
							Primitive.newPrimitive("dependency/vacuumworld-1.2.0.jar")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("Lloyd","ei")).launch(
									(java.lang.String) intention.evaluate(predicate.getTerm(0)),
									(java.lang.String) intention.evaluate(predicate.getTerm(1))
								);
							}
						}
					),
					new ModuleCall("ei",
						"Lloyd", new int[] {19,8,19,17},
						new Predicate("join", new Term[] {}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("Lloyd","ei")).join(
								);
							}
						}
					),
					new ModuleCall("ei",
						"Lloyd", new int[] {20,8,20,24},
						new Predicate("link", new Term[] {
							Primitive.newPrimitive("Lloyd")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("Lloyd","ei")).link(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					)
				}
			)
		));
		addRule(new Rule(
			"Lloyd", new int[] {25,9,25,19},
			new GoalEvent('+',
				new Goal(
					new Predicate("init", new Term[] {})
				)
			),
			Predicate.TRUE,
			new Block(
				"Lloyd", new int[] {25,18,125,5},
				new Statement[] {
					new Wait(
						"Lloyd", new int[] {26,8,125,5},
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
						"Lloyd", new int[] {27,8,125,5},
						new OR(
							new Predicate("position", new Term[] {
								Primitive.newPrimitive("top")
							}),
							new Predicate("position", new Term[] {
								Primitive.newPrimitive("bottom")
							})
						)
					),
					new While(
						"Lloyd", new int[] {29,8,125,5},
						new Predicate("job", new Term[] {
							Primitive.newPrimitive("top")
						}),
						new Block(
							"Lloyd", new int[] {29,26,76,9},
							new Statement[] {
								new If(
									"Lloyd", new int[] {30,12,76,9},
									new Predicate("position", new Term[] {
										Primitive.newPrimitive("top")
									}),
									new Block(
										"Lloyd", new int[] {30,32,62,13},
										new Statement[] {
											new ModuleCall("ei",
												"Lloyd", new int[] {31,16,31,30},
												new Predicate("light", new Term[] {
													Primitive.newPrimitive("on")
												}),
												new DefaultModuleCallAdaptor() {
													public boolean inline() {
														return false;
													}

													public boolean invoke(Intention intention, Predicate predicate) {
														return ((astra.lang.EIS) intention.getModule("Lloyd","ei")).auto_action(intention,evaluate(intention,predicate));
													}
												}
											),
											new If(
												"Lloyd", new int[] {32,16,62,13},
												new OR(
													new Predicate("peak", new Term[] {
														Primitive.newPrimitive("obstacle")
													}),
													new Predicate("peak", new Term[] {
														Primitive.newPrimitive("vac")
													})
												),
												new Block(
													"Lloyd", new int[] {32,51,37,17},
													new Statement[] {
														new Declaration(
															new Variable(Type.STRING, "turn"),
															"Lloyd", new int[] {33,20,37,17},
															new ModuleTerm("mod", Type.STRING,
																new Predicate("randomTurn", new Term[] {}),
																new ModuleTermAdaptor() {
																	public Object invoke(Intention intention, Predicate predicate) {
																		return ((MyModule) intention.getModule("Lloyd","mod")).randomTurn(
																		);
																	}
																	public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
																		return ((MyModule) visitor.agent().getModule("Lloyd","mod")).randomTurn(
																		);
																	}
																}
															)
														),
														new ModuleCall("ei",
															"Lloyd", new int[] {34,20,34,35},
															new Predicate("move", new Term[] {
																new Variable(Type.STRING, "turn"),
																Primitive.newPrimitive(1)
															}),
															new DefaultModuleCallAdaptor() {
																public boolean inline() {
																	return false;
																}

																public boolean invoke(Intention intention, Predicate predicate) {
																	return ((astra.lang.EIS) intention.getModule("Lloyd","ei")).auto_action(intention,evaluate(intention,predicate));
																}
															}
														),
														new ModuleCall("mod2",
															"Lloyd", new int[] {35,20,35,39},
															new Predicate("pauseWait", new Term[] {
																Primitive.newPrimitive(1000)
															}),
															new DefaultModuleCallAdaptor() {
																public boolean inline() {
																	return true;
																}

																public boolean invoke(Intention intention, Predicate predicate) {
																	return ((MyModule2) intention.getModule("Lloyd","mod2")).pauseWait(
																		(java.lang.Integer) intention.evaluate(predicate.getTerm(0))
																	);
																}
															}
														),
														new ModuleCall("ei",
															"Lloyd", new int[] {36,20,36,30},
															new Predicate("clean", new Term[] {}),
															new DefaultModuleCallAdaptor() {
																public boolean inline() {
																	return false;
																}

																public boolean invoke(Intention intention, Predicate predicate) {
																	return ((astra.lang.EIS) intention.getModule("Lloyd","ei")).auto_action(intention,evaluate(intention,predicate));
																}
															}
														)
													}
												),
												new If(
													"Lloyd", new int[] {37,23,62,13},
													new Predicate("peak", new Term[] {
														Primitive.newPrimitive("empty")
													}),
													new Block(
														"Lloyd", new int[] {37,40,49,17},
														new Statement[] {
															new Declaration(
																new Variable(Type.STRING, "turn"),
																"Lloyd", new int[] {38,20,49,17},
																new ModuleTerm("mod", Type.STRING,
																	new Predicate("randomTurn", new Term[] {}),
																	new ModuleTermAdaptor() {
																		public Object invoke(Intention intention, Predicate predicate) {
																			return ((MyModule) intention.getModule("Lloyd","mod")).randomTurn(
																			);
																		}
																		public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
																			return ((MyModule) visitor.agent().getModule("Lloyd","mod")).randomTurn(
																			);
																		}
																	}
																)
															),
															new Declaration(
																new Variable(Type.INTEGER, "rand"),
																"Lloyd", new int[] {39,20,49,17},
																new ModuleTerm("mod3", Type.INTEGER,
																	new Predicate("randomInt", new Term[] {}),
																	new ModuleTermAdaptor() {
																		public Object invoke(Intention intention, Predicate predicate) {
																			return ((MyModule3) intention.getModule("Lloyd","mod3")).randomInt(
																			);
																		}
																		public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
																			return ((MyModule3) visitor.agent().getModule("Lloyd","mod3")).randomInt(
																			);
																		}
																	}
																)
															),
															new If(
																"Lloyd", new int[] {40,20,49,17},
																new Comparison("==",
																	new Variable(Type.INTEGER, "rand"),
																	Primitive.newPrimitive(6)
																),
																new Block(
																	"Lloyd", new int[] {40,33,44,21},
																	new Statement[] {
																		new ModuleCall("C",
																			"Lloyd", new int[] {41,24,41,43},
																			new Predicate("println", new Term[] {
																				Primitive.newPrimitive("RANDOM")
																			}),
																			new DefaultModuleCallAdaptor() {
																				public boolean inline() {
																					return true;
																				}

																				public boolean invoke(Intention intention, Predicate predicate) {
																					return ((astra.lang.Console) intention.getModule("Lloyd","C")).println(
																						(java.lang.String) intention.evaluate(predicate.getTerm(0))
																					);
																				}
																			}
																		),
																		new ModuleCall("ei",
																			"Lloyd", new int[] {42,24,42,39},
																			new Predicate("move", new Term[] {
																				new Variable(Type.STRING, "turn"),
																				Primitive.newPrimitive(1)
																			}),
																			new DefaultModuleCallAdaptor() {
																				public boolean inline() {
																					return false;
																				}

																				public boolean invoke(Intention intention, Predicate predicate) {
																					return ((astra.lang.EIS) intention.getModule("Lloyd","ei")).auto_action(intention,evaluate(intention,predicate));
																				}
																			}
																		),
																		new ModuleCall("mod2",
																			"Lloyd", new int[] {43,24,43,43},
																			new Predicate("pauseWait", new Term[] {
																				Primitive.newPrimitive(1000)
																			}),
																			new DefaultModuleCallAdaptor() {
																				public boolean inline() {
																					return true;
																				}

																				public boolean invoke(Intention intention, Predicate predicate) {
																					return ((MyModule2) intention.getModule("Lloyd","mod2")).pauseWait(
																						(java.lang.Integer) intention.evaluate(predicate.getTerm(0))
																					);
																				}
																			}
																		)
																	}
																),
																new Block(
																	"Lloyd", new int[] {44,27,49,17},
																	new Statement[] {
																		new ModuleCall("ei",
																			"Lloyd", new int[] {45,24,45,44},
																			new Predicate("move", new Term[] {
																				Primitive.newPrimitive("forward"),
																				Primitive.newPrimitive(1)
																			}),
																			new DefaultModuleCallAdaptor() {
																				public boolean inline() {
																					return false;
																				}

																				public boolean invoke(Intention intention, Predicate predicate) {
																					return ((astra.lang.EIS) intention.getModule("Lloyd","ei")).auto_action(intention,evaluate(intention,predicate));
																				}
																			}
																		),
																		new ModuleCall("mod2",
																			"Lloyd", new int[] {46,24,46,43},
																			new Predicate("pauseWait", new Term[] {
																				Primitive.newPrimitive(1000)
																			}),
																			new DefaultModuleCallAdaptor() {
																				public boolean inline() {
																					return true;
																				}

																				public boolean invoke(Intention intention, Predicate predicate) {
																					return ((MyModule2) intention.getModule("Lloyd","mod2")).pauseWait(
																						(java.lang.Integer) intention.evaluate(predicate.getTerm(0))
																					);
																				}
																			}
																		),
																		new ModuleCall("ei",
																			"Lloyd", new int[] {47,24,47,34},
																			new Predicate("clean", new Term[] {}),
																			new DefaultModuleCallAdaptor() {
																				public boolean inline() {
																					return false;
																				}

																				public boolean invoke(Intention intention, Predicate predicate) {
																					return ((astra.lang.EIS) intention.getModule("Lloyd","ei")).auto_action(intention,evaluate(intention,predicate));
																				}
																			}
																		)
																	}
																)
															)
														}
													),
													new If(
														"Lloyd", new int[] {49,23,62,13},
														new Predicate("peak", new Term[] {
															Primitive.newPrimitive("dust")
														}),
														new Block(
															"Lloyd", new int[] {49,39,61,17},
															new Statement[] {
																new Declaration(
																	new Variable(Type.STRING, "turn"),
																	"Lloyd", new int[] {50,20,61,17},
																	new ModuleTerm("mod", Type.STRING,
																		new Predicate("randomTurn", new Term[] {}),
																		new ModuleTermAdaptor() {
																			public Object invoke(Intention intention, Predicate predicate) {
																				return ((MyModule) intention.getModule("Lloyd","mod")).randomTurn(
																				);
																			}
																			public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
																				return ((MyModule) visitor.agent().getModule("Lloyd","mod")).randomTurn(
																				);
																			}
																		}
																	)
																),
																new Declaration(
																	new Variable(Type.INTEGER, "rand"),
																	"Lloyd", new int[] {51,20,61,17},
																	new ModuleTerm("mod3", Type.INTEGER,
																		new Predicate("randomInt", new Term[] {}),
																		new ModuleTermAdaptor() {
																			public Object invoke(Intention intention, Predicate predicate) {
																				return ((MyModule3) intention.getModule("Lloyd","mod3")).randomInt(
																				);
																			}
																			public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
																				return ((MyModule3) visitor.agent().getModule("Lloyd","mod3")).randomInt(
																				);
																			}
																		}
																	)
																),
																new If(
																	"Lloyd", new int[] {52,20,61,17},
																	new Comparison("==",
																		new Variable(Type.INTEGER, "rand"),
																		Primitive.newPrimitive(6)
																	),
																	new Block(
																		"Lloyd", new int[] {52,33,56,21},
																		new Statement[] {
																			new ModuleCall("C",
																				"Lloyd", new int[] {53,24,53,43},
																				new Predicate("println", new Term[] {
																					Primitive.newPrimitive("RANDOM")
																				}),
																				new DefaultModuleCallAdaptor() {
																					public boolean inline() {
																						return true;
																					}

																					public boolean invoke(Intention intention, Predicate predicate) {
																						return ((astra.lang.Console) intention.getModule("Lloyd","C")).println(
																							(java.lang.String) intention.evaluate(predicate.getTerm(0))
																						);
																					}
																				}
																			),
																			new ModuleCall("ei",
																				"Lloyd", new int[] {54,24,54,39},
																				new Predicate("move", new Term[] {
																					new Variable(Type.STRING, "turn"),
																					Primitive.newPrimitive(1)
																				}),
																				new DefaultModuleCallAdaptor() {
																					public boolean inline() {
																						return false;
																					}

																					public boolean invoke(Intention intention, Predicate predicate) {
																						return ((astra.lang.EIS) intention.getModule("Lloyd","ei")).auto_action(intention,evaluate(intention,predicate));
																					}
																				}
																			),
																			new ModuleCall("mod2",
																				"Lloyd", new int[] {55,24,55,43},
																				new Predicate("pauseWait", new Term[] {
																					Primitive.newPrimitive(1000)
																				}),
																				new DefaultModuleCallAdaptor() {
																					public boolean inline() {
																						return true;
																					}

																					public boolean invoke(Intention intention, Predicate predicate) {
																						return ((MyModule2) intention.getModule("Lloyd","mod2")).pauseWait(
																							(java.lang.Integer) intention.evaluate(predicate.getTerm(0))
																						);
																					}
																				}
																			)
																		}
																	),
																	new Block(
																		"Lloyd", new int[] {56,27,61,17},
																		new Statement[] {
																			new ModuleCall("ei",
																				"Lloyd", new int[] {57,24,57,44},
																				new Predicate("move", new Term[] {
																					Primitive.newPrimitive("forward"),
																					Primitive.newPrimitive(1)
																				}),
																				new DefaultModuleCallAdaptor() {
																					public boolean inline() {
																						return false;
																					}

																					public boolean invoke(Intention intention, Predicate predicate) {
																						return ((astra.lang.EIS) intention.getModule("Lloyd","ei")).auto_action(intention,evaluate(intention,predicate));
																					}
																				}
																			),
																			new ModuleCall("mod2",
																				"Lloyd", new int[] {58,24,58,43},
																				new Predicate("pauseWait", new Term[] {
																					Primitive.newPrimitive(1000)
																				}),
																				new DefaultModuleCallAdaptor() {
																					public boolean inline() {
																						return true;
																					}

																					public boolean invoke(Intention intention, Predicate predicate) {
																						return ((MyModule2) intention.getModule("Lloyd","mod2")).pauseWait(
																							(java.lang.Integer) intention.evaluate(predicate.getTerm(0))
																						);
																					}
																				}
																			),
																			new ModuleCall("ei",
																				"Lloyd", new int[] {59,24,59,34},
																				new Predicate("clean", new Term[] {}),
																				new DefaultModuleCallAdaptor() {
																					public boolean inline() {
																						return false;
																					}

																					public boolean invoke(Intention intention, Predicate predicate) {
																						return ((astra.lang.EIS) intention.getModule("Lloyd","ei")).auto_action(intention,evaluate(intention,predicate));
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
									"Lloyd", new int[] {63,12,76,9},
									new Predicate("position", new Term[] {
										Primitive.newPrimitive("bottom")
									}),
									new Block(
										"Lloyd", new int[] {63,35,75,13},
										new Statement[] {
											new ModuleCall("ei",
												"Lloyd", new int[] {64,16,64,31},
												new Predicate("light", new Term[] {
													Primitive.newPrimitive("off")
												}),
												new DefaultModuleCallAdaptor() {
													public boolean inline() {
														return false;
													}

													public boolean invoke(Intention intention, Predicate predicate) {
														return ((astra.lang.EIS) intention.getModule("Lloyd","ei")).auto_action(intention,evaluate(intention,predicate));
													}
												}
											),
											new If(
												"Lloyd", new int[] {65,16,75,13},
												new OR(
													new Predicate("peak", new Term[] {
														Primitive.newPrimitive("obstacle")
													}),
													new Predicate("peak", new Term[] {
														Primitive.newPrimitive("vac")
													})
												),
												new Block(
													"Lloyd", new int[] {65,51,70,17},
													new Statement[] {
														new Declaration(
															new Variable(Type.STRING, "turn"),
															"Lloyd", new int[] {66,20,70,17},
															new ModuleTerm("mod", Type.STRING,
																new Predicate("randomTurn", new Term[] {}),
																new ModuleTermAdaptor() {
																	public Object invoke(Intention intention, Predicate predicate) {
																		return ((MyModule) intention.getModule("Lloyd","mod")).randomTurn(
																		);
																	}
																	public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
																		return ((MyModule) visitor.agent().getModule("Lloyd","mod")).randomTurn(
																		);
																	}
																}
															)
														),
														new ModuleCall("ei",
															"Lloyd", new int[] {67,20,67,35},
															new Predicate("move", new Term[] {
																new Variable(Type.STRING, "turn"),
																Primitive.newPrimitive(1)
															}),
															new DefaultModuleCallAdaptor() {
																public boolean inline() {
																	return false;
																}

																public boolean invoke(Intention intention, Predicate predicate) {
																	return ((astra.lang.EIS) intention.getModule("Lloyd","ei")).auto_action(intention,evaluate(intention,predicate));
																}
															}
														),
														new ModuleCall("mod2",
															"Lloyd", new int[] {68,20,68,39},
															new Predicate("pauseWait", new Term[] {
																Primitive.newPrimitive(1000)
															}),
															new DefaultModuleCallAdaptor() {
																public boolean inline() {
																	return true;
																}

																public boolean invoke(Intention intention, Predicate predicate) {
																	return ((MyModule2) intention.getModule("Lloyd","mod2")).pauseWait(
																		(java.lang.Integer) intention.evaluate(predicate.getTerm(0))
																	);
																}
															}
														),
														new ModuleCall("ei",
															"Lloyd", new int[] {69,20,69,30},
															new Predicate("clean", new Term[] {}),
															new DefaultModuleCallAdaptor() {
																public boolean inline() {
																	return false;
																}

																public boolean invoke(Intention intention, Predicate predicate) {
																	return ((astra.lang.EIS) intention.getModule("Lloyd","ei")).auto_action(intention,evaluate(intention,predicate));
																}
															}
														)
													}
												),
												new Block(
													"Lloyd", new int[] {70,23,75,13},
													new Statement[] {
														new ModuleCall("ei",
															"Lloyd", new int[] {71,20,71,38},
															new Predicate("move", new Term[] {
																Primitive.newPrimitive("north"),
																Primitive.newPrimitive(1)
															}),
															new DefaultModuleCallAdaptor() {
																public boolean inline() {
																	return false;
																}

																public boolean invoke(Intention intention, Predicate predicate) {
																	return ((astra.lang.EIS) intention.getModule("Lloyd","ei")).auto_action(intention,evaluate(intention,predicate));
																}
															}
														),
														new ModuleCall("mod2",
															"Lloyd", new int[] {72,20,72,39},
															new Predicate("pauseWait", new Term[] {
																Primitive.newPrimitive(1000)
															}),
															new DefaultModuleCallAdaptor() {
																public boolean inline() {
																	return true;
																}

																public boolean invoke(Intention intention, Predicate predicate) {
																	return ((MyModule2) intention.getModule("Lloyd","mod2")).pauseWait(
																		(java.lang.Integer) intention.evaluate(predicate.getTerm(0))
																	);
																}
															}
														),
														new ModuleCall("ei",
															"Lloyd", new int[] {73,20,73,30},
															new Predicate("clean", new Term[] {}),
															new DefaultModuleCallAdaptor() {
																public boolean inline() {
																	return false;
																}

																public boolean invoke(Intention intention, Predicate predicate) {
																	return ((astra.lang.EIS) intention.getModule("Lloyd","ei")).auto_action(intention,evaluate(intention,predicate));
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
						"Lloyd", new int[] {77,8,125,5},
						new Predicate("job", new Term[] {
							Primitive.newPrimitive("bottom")
						}),
						new Block(
							"Lloyd", new int[] {77,29,124,9},
							new Statement[] {
								new If(
									"Lloyd", new int[] {78,12,124,9},
									new Predicate("position", new Term[] {
										Primitive.newPrimitive("bottom")
									}),
									new Block(
										"Lloyd", new int[] {78,35,110,13},
										new Statement[] {
											new ModuleCall("ei",
												"Lloyd", new int[] {79,16,79,30},
												new Predicate("light", new Term[] {
													Primitive.newPrimitive("on")
												}),
												new DefaultModuleCallAdaptor() {
													public boolean inline() {
														return false;
													}

													public boolean invoke(Intention intention, Predicate predicate) {
														return ((astra.lang.EIS) intention.getModule("Lloyd","ei")).auto_action(intention,evaluate(intention,predicate));
													}
												}
											),
											new If(
												"Lloyd", new int[] {80,16,110,13},
												new OR(
													new Predicate("peak", new Term[] {
														Primitive.newPrimitive("obstacle")
													}),
													new Predicate("peak", new Term[] {
														Primitive.newPrimitive("vac")
													})
												),
												new Block(
													"Lloyd", new int[] {80,51,85,17},
													new Statement[] {
														new Declaration(
															new Variable(Type.STRING, "turn"),
															"Lloyd", new int[] {81,20,85,17},
															new ModuleTerm("mod", Type.STRING,
																new Predicate("randomTurn", new Term[] {}),
																new ModuleTermAdaptor() {
																	public Object invoke(Intention intention, Predicate predicate) {
																		return ((MyModule) intention.getModule("Lloyd","mod")).randomTurn(
																		);
																	}
																	public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
																		return ((MyModule) visitor.agent().getModule("Lloyd","mod")).randomTurn(
																		);
																	}
																}
															)
														),
														new ModuleCall("ei",
															"Lloyd", new int[] {82,20,82,35},
															new Predicate("move", new Term[] {
																new Variable(Type.STRING, "turn"),
																Primitive.newPrimitive(1)
															}),
															new DefaultModuleCallAdaptor() {
																public boolean inline() {
																	return false;
																}

																public boolean invoke(Intention intention, Predicate predicate) {
																	return ((astra.lang.EIS) intention.getModule("Lloyd","ei")).auto_action(intention,evaluate(intention,predicate));
																}
															}
														),
														new ModuleCall("mod2",
															"Lloyd", new int[] {83,20,83,39},
															new Predicate("pauseWait", new Term[] {
																Primitive.newPrimitive(1000)
															}),
															new DefaultModuleCallAdaptor() {
																public boolean inline() {
																	return true;
																}

																public boolean invoke(Intention intention, Predicate predicate) {
																	return ((MyModule2) intention.getModule("Lloyd","mod2")).pauseWait(
																		(java.lang.Integer) intention.evaluate(predicate.getTerm(0))
																	);
																}
															}
														),
														new ModuleCall("ei",
															"Lloyd", new int[] {84,20,84,30},
															new Predicate("clean", new Term[] {}),
															new DefaultModuleCallAdaptor() {
																public boolean inline() {
																	return false;
																}

																public boolean invoke(Intention intention, Predicate predicate) {
																	return ((astra.lang.EIS) intention.getModule("Lloyd","ei")).auto_action(intention,evaluate(intention,predicate));
																}
															}
														)
													}
												),
												new If(
													"Lloyd", new int[] {85,23,110,13},
													new Predicate("peak", new Term[] {
														Primitive.newPrimitive("empty")
													}),
													new Block(
														"Lloyd", new int[] {85,41,97,17},
														new Statement[] {
															new Declaration(
																new Variable(Type.STRING, "turn"),
																"Lloyd", new int[] {86,20,97,17},
																new ModuleTerm("mod", Type.STRING,
																	new Predicate("randomTurn", new Term[] {}),
																	new ModuleTermAdaptor() {
																		public Object invoke(Intention intention, Predicate predicate) {
																			return ((MyModule) intention.getModule("Lloyd","mod")).randomTurn(
																			);
																		}
																		public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
																			return ((MyModule) visitor.agent().getModule("Lloyd","mod")).randomTurn(
																			);
																		}
																	}
																)
															),
															new Declaration(
																new Variable(Type.INTEGER, "rand"),
																"Lloyd", new int[] {87,20,97,17},
																new ModuleTerm("mod3", Type.INTEGER,
																	new Predicate("randomInt", new Term[] {}),
																	new ModuleTermAdaptor() {
																		public Object invoke(Intention intention, Predicate predicate) {
																			return ((MyModule3) intention.getModule("Lloyd","mod3")).randomInt(
																			);
																		}
																		public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
																			return ((MyModule3) visitor.agent().getModule("Lloyd","mod3")).randomInt(
																			);
																		}
																	}
																)
															),
															new If(
																"Lloyd", new int[] {88,20,97,17},
																new Comparison("==",
																	new Variable(Type.INTEGER, "rand"),
																	Primitive.newPrimitive(6)
																),
																new Block(
																	"Lloyd", new int[] {88,33,92,21},
																	new Statement[] {
																		new ModuleCall("C",
																			"Lloyd", new int[] {89,24,89,43},
																			new Predicate("println", new Term[] {
																				Primitive.newPrimitive("RANDOM")
																			}),
																			new DefaultModuleCallAdaptor() {
																				public boolean inline() {
																					return true;
																				}

																				public boolean invoke(Intention intention, Predicate predicate) {
																					return ((astra.lang.Console) intention.getModule("Lloyd","C")).println(
																						(java.lang.String) intention.evaluate(predicate.getTerm(0))
																					);
																				}
																			}
																		),
																		new ModuleCall("ei",
																			"Lloyd", new int[] {90,24,90,39},
																			new Predicate("move", new Term[] {
																				new Variable(Type.STRING, "turn"),
																				Primitive.newPrimitive(1)
																			}),
																			new DefaultModuleCallAdaptor() {
																				public boolean inline() {
																					return false;
																				}

																				public boolean invoke(Intention intention, Predicate predicate) {
																					return ((astra.lang.EIS) intention.getModule("Lloyd","ei")).auto_action(intention,evaluate(intention,predicate));
																				}
																			}
																		),
																		new ModuleCall("mod2",
																			"Lloyd", new int[] {91,24,91,43},
																			new Predicate("pauseWait", new Term[] {
																				Primitive.newPrimitive(1000)
																			}),
																			new DefaultModuleCallAdaptor() {
																				public boolean inline() {
																					return true;
																				}

																				public boolean invoke(Intention intention, Predicate predicate) {
																					return ((MyModule2) intention.getModule("Lloyd","mod2")).pauseWait(
																						(java.lang.Integer) intention.evaluate(predicate.getTerm(0))
																					);
																				}
																			}
																		)
																	}
																),
																new If(
																	"Lloyd", new int[] {92,27,97,17},
																	new Predicate("peak", new Term[] {
																		Primitive.newPrimitive("empty")
																	}),
																	new Block(
																		"Lloyd", new int[] {92,45,96,21},
																		new Statement[] {
																			new ModuleCall("ei",
																				"Lloyd", new int[] {93,24,93,44},
																				new Predicate("move", new Term[] {
																					Primitive.newPrimitive("forward"),
																					Primitive.newPrimitive(1)
																				}),
																				new DefaultModuleCallAdaptor() {
																					public boolean inline() {
																						return false;
																					}

																					public boolean invoke(Intention intention, Predicate predicate) {
																						return ((astra.lang.EIS) intention.getModule("Lloyd","ei")).auto_action(intention,evaluate(intention,predicate));
																					}
																				}
																			),
																			new ModuleCall("mod2",
																				"Lloyd", new int[] {94,24,94,43},
																				new Predicate("pauseWait", new Term[] {
																					Primitive.newPrimitive(1000)
																				}),
																				new DefaultModuleCallAdaptor() {
																					public boolean inline() {
																						return true;
																					}

																					public boolean invoke(Intention intention, Predicate predicate) {
																						return ((MyModule2) intention.getModule("Lloyd","mod2")).pauseWait(
																							(java.lang.Integer) intention.evaluate(predicate.getTerm(0))
																						);
																					}
																				}
																			),
																			new ModuleCall("ei",
																				"Lloyd", new int[] {95,24,95,34},
																				new Predicate("clean", new Term[] {}),
																				new DefaultModuleCallAdaptor() {
																					public boolean inline() {
																						return false;
																					}

																					public boolean invoke(Intention intention, Predicate predicate) {
																						return ((astra.lang.EIS) intention.getModule("Lloyd","ei")).auto_action(intention,evaluate(intention,predicate));
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
														"Lloyd", new int[] {97,23,110,13},
														new Predicate("peak", new Term[] {
															Primitive.newPrimitive("dust")
														}),
														new Block(
															"Lloyd", new int[] {97,40,109,17},
															new Statement[] {
																new Declaration(
																	new Variable(Type.STRING, "turn"),
																	"Lloyd", new int[] {98,20,109,17},
																	new ModuleTerm("mod", Type.STRING,
																		new Predicate("randomTurn", new Term[] {}),
																		new ModuleTermAdaptor() {
																			public Object invoke(Intention intention, Predicate predicate) {
																				return ((MyModule) intention.getModule("Lloyd","mod")).randomTurn(
																				);
																			}
																			public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
																				return ((MyModule) visitor.agent().getModule("Lloyd","mod")).randomTurn(
																				);
																			}
																		}
																	)
																),
																new Declaration(
																	new Variable(Type.INTEGER, "rand"),
																	"Lloyd", new int[] {99,20,109,17},
																	new ModuleTerm("mod3", Type.INTEGER,
																		new Predicate("randomInt", new Term[] {}),
																		new ModuleTermAdaptor() {
																			public Object invoke(Intention intention, Predicate predicate) {
																				return ((MyModule3) intention.getModule("Lloyd","mod3")).randomInt(
																				);
																			}
																			public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
																				return ((MyModule3) visitor.agent().getModule("Lloyd","mod3")).randomInt(
																				);
																			}
																		}
																	)
																),
																new If(
																	"Lloyd", new int[] {100,20,109,17},
																	new Comparison("==",
																		new Variable(Type.INTEGER, "rand"),
																		Primitive.newPrimitive(6)
																	),
																	new Block(
																		"Lloyd", new int[] {100,33,104,21},
																		new Statement[] {
																			new ModuleCall("C",
																				"Lloyd", new int[] {101,24,101,43},
																				new Predicate("println", new Term[] {
																					Primitive.newPrimitive("RANDOM")
																				}),
																				new DefaultModuleCallAdaptor() {
																					public boolean inline() {
																						return true;
																					}

																					public boolean invoke(Intention intention, Predicate predicate) {
																						return ((astra.lang.Console) intention.getModule("Lloyd","C")).println(
																							(java.lang.String) intention.evaluate(predicate.getTerm(0))
																						);
																					}
																				}
																			),
																			new ModuleCall("ei",
																				"Lloyd", new int[] {102,24,102,39},
																				new Predicate("move", new Term[] {
																					new Variable(Type.STRING, "turn"),
																					Primitive.newPrimitive(1)
																				}),
																				new DefaultModuleCallAdaptor() {
																					public boolean inline() {
																						return false;
																					}

																					public boolean invoke(Intention intention, Predicate predicate) {
																						return ((astra.lang.EIS) intention.getModule("Lloyd","ei")).auto_action(intention,evaluate(intention,predicate));
																					}
																				}
																			),
																			new ModuleCall("mod2",
																				"Lloyd", new int[] {103,24,103,43},
																				new Predicate("pauseWait", new Term[] {
																					Primitive.newPrimitive(1000)
																				}),
																				new DefaultModuleCallAdaptor() {
																					public boolean inline() {
																						return true;
																					}

																					public boolean invoke(Intention intention, Predicate predicate) {
																						return ((MyModule2) intention.getModule("Lloyd","mod2")).pauseWait(
																							(java.lang.Integer) intention.evaluate(predicate.getTerm(0))
																						);
																					}
																				}
																			)
																		}
																	),
																	new If(
																		"Lloyd", new int[] {104,27,109,17},
																		new Predicate("peak", new Term[] {
																			Primitive.newPrimitive("dust")
																		}),
																		new Block(
																			"Lloyd", new int[] {104,44,108,21},
																			new Statement[] {
																				new ModuleCall("ei",
																					"Lloyd", new int[] {105,24,105,44},
																					new Predicate("move", new Term[] {
																						Primitive.newPrimitive("forward"),
																						Primitive.newPrimitive(1)
																					}),
																					new DefaultModuleCallAdaptor() {
																						public boolean inline() {
																							return false;
																						}

																						public boolean invoke(Intention intention, Predicate predicate) {
																							return ((astra.lang.EIS) intention.getModule("Lloyd","ei")).auto_action(intention,evaluate(intention,predicate));
																						}
																					}
																				),
																				new ModuleCall("mod2",
																					"Lloyd", new int[] {106,24,106,43},
																					new Predicate("pauseWait", new Term[] {
																						Primitive.newPrimitive(1000)
																					}),
																					new DefaultModuleCallAdaptor() {
																						public boolean inline() {
																							return true;
																						}

																						public boolean invoke(Intention intention, Predicate predicate) {
																							return ((MyModule2) intention.getModule("Lloyd","mod2")).pauseWait(
																								(java.lang.Integer) intention.evaluate(predicate.getTerm(0))
																							);
																						}
																					}
																				),
																				new ModuleCall("ei",
																					"Lloyd", new int[] {107,24,107,34},
																					new Predicate("clean", new Term[] {}),
																					new DefaultModuleCallAdaptor() {
																						public boolean inline() {
																							return false;
																						}

																						public boolean invoke(Intention intention, Predicate predicate) {
																							return ((astra.lang.EIS) intention.getModule("Lloyd","ei")).auto_action(intention,evaluate(intention,predicate));
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
									"Lloyd", new int[] {111,12,124,9},
									new Predicate("position", new Term[] {
										Primitive.newPrimitive("top")
									}),
									new Block(
										"Lloyd", new int[] {111,32,123,13},
										new Statement[] {
											new ModuleCall("ei",
												"Lloyd", new int[] {112,16,112,31},
												new Predicate("light", new Term[] {
													Primitive.newPrimitive("off")
												}),
												new DefaultModuleCallAdaptor() {
													public boolean inline() {
														return false;
													}

													public boolean invoke(Intention intention, Predicate predicate) {
														return ((astra.lang.EIS) intention.getModule("Lloyd","ei")).auto_action(intention,evaluate(intention,predicate));
													}
												}
											),
											new If(
												"Lloyd", new int[] {113,16,123,13},
												new OR(
													new Predicate("peak", new Term[] {
														Primitive.newPrimitive("obstacle")
													}),
													new Predicate("peak", new Term[] {
														Primitive.newPrimitive("vac")
													})
												),
												new Block(
													"Lloyd", new int[] {113,51,118,17},
													new Statement[] {
														new Declaration(
															new Variable(Type.STRING, "turn"),
															"Lloyd", new int[] {114,20,118,17},
															new ModuleTerm("mod", Type.STRING,
																new Predicate("randomTurn", new Term[] {}),
																new ModuleTermAdaptor() {
																	public Object invoke(Intention intention, Predicate predicate) {
																		return ((MyModule) intention.getModule("Lloyd","mod")).randomTurn(
																		);
																	}
																	public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
																		return ((MyModule) visitor.agent().getModule("Lloyd","mod")).randomTurn(
																		);
																	}
																}
															)
														),
														new ModuleCall("ei",
															"Lloyd", new int[] {115,20,115,35},
															new Predicate("move", new Term[] {
																new Variable(Type.STRING, "turn"),
																Primitive.newPrimitive(1)
															}),
															new DefaultModuleCallAdaptor() {
																public boolean inline() {
																	return false;
																}

																public boolean invoke(Intention intention, Predicate predicate) {
																	return ((astra.lang.EIS) intention.getModule("Lloyd","ei")).auto_action(intention,evaluate(intention,predicate));
																}
															}
														),
														new ModuleCall("mod2",
															"Lloyd", new int[] {116,20,116,39},
															new Predicate("pauseWait", new Term[] {
																Primitive.newPrimitive(1000)
															}),
															new DefaultModuleCallAdaptor() {
																public boolean inline() {
																	return true;
																}

																public boolean invoke(Intention intention, Predicate predicate) {
																	return ((MyModule2) intention.getModule("Lloyd","mod2")).pauseWait(
																		(java.lang.Integer) intention.evaluate(predicate.getTerm(0))
																	);
																}
															}
														),
														new ModuleCall("ei",
															"Lloyd", new int[] {117,20,117,30},
															new Predicate("clean", new Term[] {}),
															new DefaultModuleCallAdaptor() {
																public boolean inline() {
																	return false;
																}

																public boolean invoke(Intention intention, Predicate predicate) {
																	return ((astra.lang.EIS) intention.getModule("Lloyd","ei")).auto_action(intention,evaluate(intention,predicate));
																}
															}
														)
													}
												),
												new Block(
													"Lloyd", new int[] {118,23,123,13},
													new Statement[] {
														new ModuleCall("ei",
															"Lloyd", new int[] {119,20,119,38},
															new Predicate("move", new Term[] {
																Primitive.newPrimitive("south"),
																Primitive.newPrimitive(1)
															}),
															new DefaultModuleCallAdaptor() {
																public boolean inline() {
																	return false;
																}

																public boolean invoke(Intention intention, Predicate predicate) {
																	return ((astra.lang.EIS) intention.getModule("Lloyd","ei")).auto_action(intention,evaluate(intention,predicate));
																}
															}
														),
														new ModuleCall("mod2",
															"Lloyd", new int[] {120,20,120,39},
															new Predicate("pauseWait", new Term[] {
																Primitive.newPrimitive(1000)
															}),
															new DefaultModuleCallAdaptor() {
																public boolean inline() {
																	return true;
																}

																public boolean invoke(Intention intention, Predicate predicate) {
																	return ((MyModule2) intention.getModule("Lloyd","mod2")).pauseWait(
																		(java.lang.Integer) intention.evaluate(predicate.getTerm(0))
																	);
																}
															}
														),
														new ModuleCall("ei",
															"Lloyd", new int[] {121,20,121,30},
															new Predicate("clean", new Term[] {}),
															new DefaultModuleCallAdaptor() {
																public boolean inline() {
																	return false;
																}

																public boolean invoke(Intention intention, Predicate predicate) {
																	return ((astra.lang.EIS) intention.getModule("Lloyd","ei")).auto_action(intention,evaluate(intention,predicate));
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
			"Lloyd", new int[] {127,9,127,45},
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
						return ((astra.lang.EIS) agent.getModule("Lloyd","ei")).event(
							"+",
							predicate.getTerm(0)
						);
					}
				}
			),
			Predicate.TRUE,
			new Block(
				"Lloyd", new int[] {127,44,133,5},
				new Statement[] {
					new If(
						"Lloyd", new int[] {128,8,133,5},
						new Comparison("<=",
							new Variable(Type.INTEGER, "y"),
							Primitive.newPrimitive(3)
						),
						new Block(
							"Lloyd", new int[] {128,18,130,9},
							new Statement[] {
								new Send("Lloyd", new int[] {129,12,129,46},
									new Performative("inform"),
									Primitive.newPrimitive("Decco"),
									new Predicate("area", new Term[] {
										Primitive.newPrimitive("top")
									})
								)
							}
						),
						new If(
							"Lloyd", new int[] {130,15,133,5},
							new Comparison(">=",
								new Variable(Type.INTEGER, "y"),
								Primitive.newPrimitive(4)
							),
							new Block(
								"Lloyd", new int[] {130,25,132,9},
								new Statement[] {
									new Send("Lloyd", new int[] {131,12,131,49},
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
			"Lloyd", new int[] {135,9,135,65},
			new MessageEvent(
				new Performative("inform"),
				new Variable(Type.STRING, "sender",false),
				new Predicate("instruction", new Term[] {
					new Variable(Type.STRING, "Y",false)
				})
			),
			Predicate.TRUE,
			new Block(
				"Lloyd", new int[] {135,64,138,5},
				new Statement[] {
					new ModuleCall("C",
						"Lloyd", new int[] {136,8,136,89},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								new Variable(Type.STRING, "sender"),
								Operator.newOperator('+',
									Primitive.newPrimitive(" has told me I will work in the "),
									Operator.newOperator('+',
										new Variable(Type.STRING, "Y"),
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
								return ((astra.lang.Console) intention.getModule("Lloyd","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new BeliefUpdate('+',
						"Lloyd", new int[] {137,8,138,5},
						new Predicate("job", new Term[] {
							new Variable(Type.STRING, "Y")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"Lloyd", new int[] {140,9,140,84},
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
						return ((astra.lang.EIS) agent.getModule("Lloyd","ei")).event(
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
						return ((astra.lang.EIS) visitor.agent().getModule("Lloyd","ei")).auto_formula((Predicate) predicate.accept(visitor));
					}
				}
			),
			new Block(
				"Lloyd", new int[] {140,83,151,5},
				new Statement[] {
					new SpecialBeliefUpdate(
						"Lloyd", new int[] {141,8,151,5},
						new Predicate("peak", new Term[] {
							new Variable(Type.STRING, "content")
						})
					),
					new If(
						"Lloyd", new int[] {143,8,151,5},
						new Comparison("<=",
							new Variable(Type.INTEGER, "d"),
							Primitive.newPrimitive(3)
						),
						new Block(
							"Lloyd", new int[] {143,18,146,9},
							new Statement[] {
								new SpecialBeliefUpdate(
									"Lloyd", new int[] {144,12,146,9},
									new Predicate("position", new Term[] {
										Primitive.newPrimitive("top")
									})
								),
								new ModuleCall("C",
									"Lloyd", new int[] {145,12,145,29},
									new Predicate("println", new Term[] {
										Primitive.newPrimitive("PTOP")
									}),
									new DefaultModuleCallAdaptor() {
										public boolean inline() {
											return true;
										}

										public boolean invoke(Intention intention, Predicate predicate) {
											return ((astra.lang.Console) intention.getModule("Lloyd","C")).println(
												(java.lang.String) intention.evaluate(predicate.getTerm(0))
											);
										}
									}
								)
							}
						)
					),
					new If(
						"Lloyd", new int[] {147,8,151,5},
						new Comparison(">=",
							new Variable(Type.INTEGER, "d"),
							Primitive.newPrimitive(4)
						),
						new Block(
							"Lloyd", new int[] {147,18,150,9},
							new Statement[] {
								new SpecialBeliefUpdate(
									"Lloyd", new int[] {148,12,150,9},
									new Predicate("position", new Term[] {
										Primitive.newPrimitive("bottom")
									})
								),
								new ModuleCall("C",
									"Lloyd", new int[] {149,12,149,29},
									new Predicate("println", new Term[] {
										Primitive.newPrimitive("PBOT")
									}),
									new DefaultModuleCallAdaptor() {
										public boolean inline() {
											return true;
										}

										public boolean invoke(Intention intention, Predicate predicate) {
											return ((astra.lang.Console) intention.getModule("Lloyd","C")).println(
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
				((astra.lang.EIS) agent.getModule("Lloyd","ei")).sense();
			}
		});

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
			astra.core.Agent agent = new Lloyd().newInstance(name);
			agent.initialize(new Goal(new Predicate("main", new Term[] { argList })));
			Scheduler.schedule(agent);
		} catch (AgentCreationException e) {
			e.printStackTrace();
		} catch (ASTRAClassNotFoundException e) {
			e.printStackTrace();
		};
	}
}
